package com.mapsa.library.sevice;

import java.util.List;

public interface BaseService<D> {

    D save(D dto) ;
    List<D> getAll() ;
}
