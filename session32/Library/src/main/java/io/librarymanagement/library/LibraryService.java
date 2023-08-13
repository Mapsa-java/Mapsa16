package io.librarymanagement.library;

import io.librarymanagement.base.mapper.IBaseMapper;
import io.librarymanagement.base.repository.IBaseRepository;
import io.librarymanagement.base.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryService extends BaseService<LibraryEntity, LibraryDto, LibraryDto> implements ILibraryService {


    private  final LibraryRepository libraryRepository;

    public LibraryService(IBaseRepository<LibraryEntity> baseRepository, IBaseMapper<LibraryEntity, LibraryDto, LibraryDto> baseMapper, LibraryRepository libraryRepository) {
        super(baseRepository, baseMapper);
        this.libraryRepository = libraryRepository;
    }

    public List<LibraryDto> findByName(String name){
        List<LibraryEntity> libraryEntities = libraryRepository.findByName(name);
        return libraryEntities.stream().map(item -> baseMapper.entityToGetDto(item)).collect(Collectors.toList());
    }
}
