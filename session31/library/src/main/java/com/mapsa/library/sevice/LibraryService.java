package com.mapsa.library.sevice;

import com.mapsa.library.model.dto.LibraryDto;
import com.mapsa.library.model.entity.LibraryEntity;
import com.mapsa.library.repository.LibraryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LibraryService  {

    private final LibraryRepository libraryRepository;

    public LibraryDto save(LibraryDto library){
        //Dto -> Entity =>save
        //Entity ->Dto => return
        return libraryRepository.save(library);
    }


}
