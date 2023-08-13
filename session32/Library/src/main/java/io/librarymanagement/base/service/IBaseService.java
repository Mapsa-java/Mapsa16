package io.librarymanagement.base.service;


import io.librarymanagement.base.exception.NotFoundException;
import io.librarymanagement.base.model.dto.BaseDto;
import io.librarymanagement.base.model.entity.BaseEntity;

import java.util.List;

public interface IBaseService<T extends BaseEntity, ResDto extends BaseDto, ReqDto extends BaseDto> {
    ResDto findById(Long id) throws NotFoundException;

    List<ResDto> findAll();

    ResDto create(ReqDto dto);

    ResDto update(ReqDto dto) throws NotFoundException;

    void deleteById(Long id);
}
