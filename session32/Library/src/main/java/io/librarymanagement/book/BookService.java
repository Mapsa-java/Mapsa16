package io.librarymanagement.book;

import io.librarymanagement.base.mapper.IBaseMapper;
import io.librarymanagement.base.repository.IBaseRepository;
import io.librarymanagement.base.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService extends BaseService<BookEntity, BookResponseDto, BookRequestDto> implements IBookService {


    private  final BookRepository bookRepository;

    public BookService(IBaseRepository<BookEntity> baseRepository, IBaseMapper<BookEntity, BookResponseDto, BookRequestDto> baseMapper, BookRepository bookRepository) {
        super(baseRepository, baseMapper);
        this.bookRepository = bookRepository;
    }

    @Override
    public BookResponseDto create(BookRequestDto dto) {
        System.out.println( "request :: " + dto.getLibrary().getId());
        BookResponseDto bookResponseDto =  super.create(dto) ;
        System.out.println("response :: " + bookResponseDto);
        return bookResponseDto;
    }

    public List<BookResponseDto> findByTitle(String title){
        List<BookEntity> libraryEntities = bookRepository.findByTitle(title);
        return libraryEntities.stream().map(item -> baseMapper.entityToGetDto(item)).collect(Collectors.toList());
    }
}
