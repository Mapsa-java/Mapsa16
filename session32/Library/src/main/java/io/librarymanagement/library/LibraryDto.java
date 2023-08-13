package io.librarymanagement.library;

import io.librarymanagement.base.model.dto.BaseDto;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibraryDto extends BaseDto {

    @NotBlank(message = "Name cannot be blank")
    private String name;

}
