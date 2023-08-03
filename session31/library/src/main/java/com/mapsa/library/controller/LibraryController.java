package com.mapsa.library.controller;

import com.mapsa.library.model.dto.LibraryDto;
import com.mapsa.library.model.entity.LibraryEntity;
import com.mapsa.library.sevice.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/libraries")
public class LibraryController {

    private final LibraryService libraryService ;

    @PostMapping
    public LibraryDto save(@RequestBody LibraryDto libraryEntity){
        return libraryService.save(LibraryDto) ;
    }
}
