package io.librarymanagement.book;

import io.librarymanagement.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))
public interface BookMapper extends IBaseMapper<BookEntity, BookResponseDto, BookRequestDto> {
}
