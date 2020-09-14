package com.example.enrolleeservice.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Dependent extends AbstractPersistable<Long> {

    private String name;
    private LocalDate dob;

    @JsonBackReference
    @ManyToOne
    private Enrollee enrollee;
}
