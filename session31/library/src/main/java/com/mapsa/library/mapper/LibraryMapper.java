package com.mapsa.library.mapper;

import com.mapsa.library.model.dto.LibraryDto;
import com.mapsa.library.model.entity.LibraryEntity;

public class LibraryMapper {

    //DtoToEntity
    //EntityToDto

    public LibraryEntity dtoToEntity(LibraryDto libraryDto){
        return  new LibraryEntity();
    }

    public LibraryDto entityToDto(LibraryEntity libraryEntity) {
        return new LibraryDto();
    }
}
