package io.librarymanagement.library;

import io.librarymanagement.base.repository.IBaseRepository;

import java.util.List;


public interface LibraryRepository extends IBaseRepository<LibraryEntity> {

    public List<LibraryEntity> findByName(String name) ;
}
