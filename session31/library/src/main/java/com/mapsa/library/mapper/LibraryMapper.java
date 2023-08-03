package com.mapsa.library.mapper;

import com.mapsa.library.model.dto.LibraryDto;
import com.mapsa.library.model.entity.LibraryEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LibraryMapper implements BaseMapper<LibraryEntity , LibraryDto> {

    //DtoToEntity
    //EntityToDto

    @Override
    public LibraryEntity dtoToEntity(LibraryDto libraryDto){
        LibraryEntity libraryEntity = new LibraryEntity() ;
        BeanUtils.copyProperties(libraryDto ,libraryEntity );
        return  libraryEntity;
    }

    @Override
    public LibraryDto entityToDto(LibraryEntity libraryEntity) {
        LibraryDto libraryDto = new LibraryDto() ;
        BeanUtils.copyProperties(libraryEntity ,libraryDto );
        return  libraryDto;
    }
}
