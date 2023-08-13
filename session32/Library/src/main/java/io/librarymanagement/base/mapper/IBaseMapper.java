package io.librarymanagement.base.mapper;


import io.librarymanagement.base.model.dto.BaseDto;
import io.librarymanagement.base.model.entity.BaseEntity;

public interface IBaseMapper<T extends BaseEntity, ResDto extends BaseDto, ReqDto extends BaseDto> {
    //
    ResDto entityToGetDto(T entity);
    T postDtoToEntity(ReqDto dto);
}
