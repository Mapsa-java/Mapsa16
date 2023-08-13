package io.librarymanagement.barrow;

import io.librarymanagement.base.exception.NotFoundException;
import io.librarymanagement.base.mapper.IBaseMapper;
import io.librarymanagement.base.repository.IBaseRepository;
import io.librarymanagement.base.service.BaseService;
import io.librarymanagement.book.BookRepository;
import io.bankmanagment.retail.customer.CustomerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class BarrowService extends BaseService<BarrowEntity, BarrowDto, BarrowDto> implements IBarrowService {


    private  final BarrowRepository barrowRepository;
    private  final BookRepository bookRepository;
    private  final CustomerRepository customerRepository;

    public BarrowService(IBaseRepository<BarrowEntity> baseRepository, IBaseMapper<BarrowEntity, BarrowDto, BarrowDto> baseMapper, BarrowRepository barrowRepository, BookRepository bookRepository, CustomerRepository customerRepository) {
        super(baseRepository, baseMapper);

        this.barrowRepository = barrowRepository;
        this.bookRepository = bookRepository;
        this.customerRepository = customerRepository;
    }

    public void giveBook(BarrowDto barrowDto) throws NotFoundException {
        bookRepository.findById(barrowDto.getBook().getId()).orElseThrow(NotFoundException :: new) ;
        customerRepository.findById(barrowDto.getCustomer().getId()).orElseThrow(NotFoundException :: new) ;

        BarrowEntity barrowEntity = baseMapper.postDtoToEntity(barrowDto) ;
        List<BarrowEntity> barrowEntityList =  barrowRepository.findByBookAndFdate(barrowEntity.getBook() , null);

        if(barrowEntityList.size()>0) {
            throw  new RuntimeException("book is not available");
        }

        LocalDate localDateStart = LocalDate.now() ;
        LocalDate localDateFinish = localDateStart.plusDays(10) ;

        barrowEntity.setSdate(convertToDate(localDateStart));
        barrowEntity.setFdate(convertToDate(localDateFinish));

        barrowRepository.save(barrowEntity) ;






        //barrowRepository
    }

    public static Date convertToDate(LocalDate localDate) {
        // Convert LocalDate to Instant using midnight time and default ZoneId
        // Then convert Instant to Date
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

//    @Override
//    public BarrowDto create(BarrowDto dto) {
//        System.out.println( "request :: " + dto.getBook().getId());
//        BookResponseDto bookResponseDto =  super.create(dto) ;
//        System.out.println("response :: " + bookResponseDto);
//        return super.create(dto);
//    }

    //    public List<LibraryDto> findByName(String name){
//        List<LibraryEntity> libraryEntities = libraryRepository.findByName(name);
//        return libraryEntities.stream().map(item -> baseMapper.entityToGetDto(item)).collect(Collectors.toList());
//    }
}
