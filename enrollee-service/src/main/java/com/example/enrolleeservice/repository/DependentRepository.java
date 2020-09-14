package com.example.enrolleeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.enrolleeservice.entity.Dependent;

@Repository
public interface DependentRepository extends JpaRepository<Dependent, Long> {

}
