package com.mapsa.library.sevice;

import com.mapsa.library.mapper.LibraryMapper;
import com.mapsa.library.model.dto.LibraryDto;
import com.mapsa.library.model.entity.LibraryEntity;
import com.mapsa.library.repository.LibraryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LibraryService implements  BaseService<LibraryDto>{

    private final LibraryRepository libraryRepository;
    private final LibraryMapper libraryMapper;

    @Override
    public LibraryDto save(LibraryDto library) {
        //Dto -> Entity =>save
        //Entity ->Dto => return
        LibraryEntity libraryEntity = libraryRepository.save(libraryMapper.dtoToEntity(library));
        return libraryMapper.entityToDto(libraryEntity);
    }

    @Override
    public  List<LibraryDto> getAll() {
        List<LibraryDto> libraryDtos = new ArrayList<>() ;

        List<LibraryEntity> libraryEntityList = libraryRepository.findAll();
        libraryEntityList.stream().forEach(item->{
            if(!item.getDeleted()){
                libraryDtos.add(libraryMapper.entityToDto(item)) ;
            }

        });

        return libraryDtos ;
    }


}
