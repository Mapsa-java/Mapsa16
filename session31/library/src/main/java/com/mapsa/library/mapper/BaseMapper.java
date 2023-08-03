package com.mapsa.library.mapper;

import com.mapsa.library.model.entity.BaseEntity;

public interface BaseMapper<E extends BaseEntity, D> {

    E dtoToEntity(D dto);

    D entityToDto(E entity);
}
