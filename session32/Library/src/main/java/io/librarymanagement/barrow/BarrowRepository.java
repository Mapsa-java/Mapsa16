package io.librarymanagement.barrow;

import io.librarymanagement.base.repository.IBaseRepository;
import io.librarymanagement.book.BookEntity;

import java.util.Date;
import java.util.List;


public interface BarrowRepository extends IBaseRepository<BarrowEntity> {

    List<BarrowEntity> findByBookAndFdate(BookEntity bookEntity ,
                                          Date fdate);

//    public List<LibraryEntity> findByName(String name) ;
}
