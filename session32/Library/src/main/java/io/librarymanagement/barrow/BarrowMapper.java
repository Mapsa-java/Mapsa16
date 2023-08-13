package io.librarymanagement.barrow;

import io.librarymanagement.base.mapper.IBaseMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))
public interface BarrowMapper extends IBaseMapper<BarrowEntity, BarrowDto, BarrowDto> {

}
