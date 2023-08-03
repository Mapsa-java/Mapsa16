package com.mapsa.library.controller;

import com.mapsa.library.sevice.BaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public abstract class BaseController<S extends BaseService<D>,D> {

    public final S service;

    public BaseController(S service) {
        this.service = service;
    }


    @PostMapping
    public D save(@RequestBody D d){
        return service.save(d);
    }



}