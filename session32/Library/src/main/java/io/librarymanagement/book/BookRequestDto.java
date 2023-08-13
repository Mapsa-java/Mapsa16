package io.librarymanagement.book;

import io.librarymanagement.base.model.dto.BaseDto;
import io.librarymanagement.library.LibraryDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequestDto extends BaseDto {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotNull(message = "publish date cannot be null")
    private Date publishDate;

    @NotBlank(message = "title cannot be blank")
    private String title;

    @NotNull(message = "library cannot be null")
    private LibraryDto library;

}
