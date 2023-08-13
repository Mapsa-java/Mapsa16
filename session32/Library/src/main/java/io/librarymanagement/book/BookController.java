package io.librarymanagement.book;

import io.librarymanagement.base.controller.BaseRestController;
import io.librarymanagement.base.service.IBaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController extends BaseRestController<BookEntity, BookResponseDto, BookRequestDto> {


    public final BookService bookService ;
    public BookController(IBaseService<BookEntity, BookResponseDto, BookRequestDto> baseService, BookService bookService) {
        super(baseService);
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<BookResponseDto>> findByTitle(@RequestParam String title)  {
        return new ResponseEntity<>(bookService.findByTitle(title), HttpStatus.OK);
    }
}
