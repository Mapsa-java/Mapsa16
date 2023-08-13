package io.librarymanagement.book;

import io.librarymanagement.base.model.dto.BaseDto;
import io.librarymanagement.library.LibraryDto;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponseDto extends BaseDto {

    private String name;
    private String title;
    private Date publishDate;
    private LibraryDto library;

}
