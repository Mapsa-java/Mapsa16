package io.librarymanagement.book;


import io.librarymanagement.base.model.entity.BaseEntity;
import io.librarymanagement.library.LibraryEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name="book")
public class BookEntity extends BaseEntity {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "title cannot be blank")
    private String title;

    @NotNull(message = "publish date cannot be blank")
    @Column(nullable = false)
    private Date publishDate;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private LibraryEntity library;



}
