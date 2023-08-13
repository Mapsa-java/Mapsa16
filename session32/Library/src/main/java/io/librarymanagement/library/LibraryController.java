package io.librarymanagement.library;

import io.librarymanagement.base.controller.BaseRestController;
import io.librarymanagement.base.service.IBaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController extends BaseRestController<LibraryEntity, LibraryDto, LibraryDto> {

    private final LibraryService LibraryService;
    public LibraryController(IBaseService<LibraryEntity, LibraryDto, LibraryDto> baseService, io.librarymanagement.library.LibraryService libraryService) {
        super(baseService);
        LibraryService = libraryService;
    }


    @GetMapping("/search")
    public ResponseEntity<List<LibraryDto>> findByName(@RequestParam String name)  {
        return new ResponseEntity<>(LibraryService.findByName(name), HttpStatus.OK);
    }
}
