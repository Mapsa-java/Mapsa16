package com.mapsa.library.controller;

import com.mapsa.library.model.dto.BaseDto;

public interface IController<Dto extends BaseDto>  {

    public Dto save(Dto d);
}
