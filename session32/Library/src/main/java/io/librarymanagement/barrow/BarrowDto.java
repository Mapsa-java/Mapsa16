package io.librarymanagement.barrow;

import io.librarymanagement.base.model.dto.BaseDto;
import io.librarymanagement.book.BookRequestDto;
import io.bankmanagment.retail.customer.CustomerDto;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BarrowDto extends BaseDto {


    private CustomerDto customer;
    private BookRequestDto book;

}
