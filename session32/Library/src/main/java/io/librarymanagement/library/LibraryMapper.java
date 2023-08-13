package io.librarymanagement.library;

import io.librarymanagement.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))
public interface LibraryMapper extends IBaseMapper<LibraryEntity, LibraryDto, LibraryDto> {
}
