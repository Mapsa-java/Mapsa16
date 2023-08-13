package io.librarymanagement.book;

import io.librarymanagement.base.repository.IBaseRepository;

import java.util.List;


public interface BookRepository extends IBaseRepository<BookEntity> {

    public List<BookEntity> findByTitle(String title) ;
}
