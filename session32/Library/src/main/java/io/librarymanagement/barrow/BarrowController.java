package io.librarymanagement.barrow;

import io.librarymanagement.base.controller.BaseRestController;
import io.librarymanagement.base.exception.NotFoundException;
import io.librarymanagement.base.service.IBaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barrow")
public class BarrowController extends BaseRestController<BarrowEntity, BarrowDto, BarrowDto> {


    private final BarrowService barrowService;

    public BarrowController(IBaseService<BarrowEntity, BarrowDto, BarrowDto> baseService, BarrowService barrowService) {
        super(baseService);
        this.barrowService = barrowService;
    }
    @PostMapping("/give")
    public void giveBook(@RequestBody BarrowDto barrowDto) throws NotFoundException {
        barrowService.giveBook(barrowDto) ;
    }


//    @GetMapping("/search")
//    public ResponseEntity<List<LibraryDto>> findByName(@RequestParam String name)  {
//        return new ResponseEntity<>(LibraryService.findByName(name), HttpStatus.OK);
//    }
}
