package com.example.enrolleeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.enrolleeservice.entity.Enrollee;

@Repository
public interface EnrolleeRepository extends JpaRepository<Enrollee, Long> {

}
