package io.librarymanagement.base.service;


import io.librarymanagement.base.exception.NotFoundException;
import io.librarymanagement.base.mapper.IBaseMapper;
import io.librarymanagement.base.model.dto.BaseDto;
import io.librarymanagement.base.model.entity.BaseEntity;
import io.librarymanagement.base.repository.IBaseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseService<T extends BaseEntity, GD extends BaseDto, PD extends BaseDto> implements IBaseService<T, GD, PD> {
    public IBaseRepository<T> baseRepository;
    public IBaseMapper<T, GD, PD> baseMapper;

    public BaseService(IBaseRepository<T> baseRepository, IBaseMapper<T, GD, PD> baseMapper) {
        this.baseRepository = baseRepository;
        this.baseMapper = baseMapper;
    }

    public GD findById(Long id) throws NotFoundException {
        T entity = baseRepository.findById(id).orElseThrow(NotFoundException::new);
        return baseMapper.entityToGetDto(entity);
    }

    public List<GD> findAll() {
        return baseRepository.findAll().stream().map(baseMapper::entityToGetDto).collect(Collectors.toList());
    }

    public GD create(PD dto) {
        T entity = baseMapper.postDtoToEntity(dto);
        return baseMapper.entityToGetDto(baseRepository.save(entity));
    }

    public GD update(PD dto) throws NotFoundException {
        T saved = baseRepository.findById(dto.getId()).orElseThrow(NotFoundException::new);
        copyNonNullProperties(dto, saved);
        return baseMapper.entityToGetDto(baseRepository.save(saved));
    }

    public void deleteById(Long id) {
        baseRepository.deleteById(id);
    }

    public static void copyNonNullProperties(Object src, Object target) {
        BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
    }


    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
