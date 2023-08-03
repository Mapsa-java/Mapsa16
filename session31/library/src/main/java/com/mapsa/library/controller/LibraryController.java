package com.mapsa.library.controller;

import com.mapsa.library.model.dto.LibraryDto;
import com.mapsa.library.sevice.LibraryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libraries")
public class LibraryController  extends  BaseController <LibraryService , LibraryDto>{


    public LibraryController(LibraryService service) {
        super(service);
    }


}
