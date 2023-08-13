package io.librarymanagement.barrow;


import io.librarymanagement.base.model.entity.BaseEntity;
import io.librarymanagement.book.BookEntity;
import io.bankmanagment.retail.customer.CustomerEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name="barrow")
public class BarrowEntity extends BaseEntity {

    private Date sdate;

    private Date fdate;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name="book_id")
    private BookEntity book;

}
