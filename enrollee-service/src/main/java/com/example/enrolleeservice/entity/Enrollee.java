package com.example.enrolleeservice.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Enrollee extends AbstractPersistable<Long> {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean activationStatus = false;

    @Column(nullable = false)
    private LocalDate dob;

    private String phoneNumber;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enrollee")
    private List<Dependent> dependents;
}
