package com.example.enrolleeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.enrolleeservice.entity.Enrollee;
import com.example.enrolleeservice.repository.EnrolleeRepository;

@Service
public class EnrolleeServiceImpl implements EnrolleeService {

    private final EnrolleeRepository repository;

    public EnrolleeServiceImpl(EnrolleeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Enrollee save(Enrollee enrollee) {
        return repository.save(enrollee);
    }

    @Override
    public List<Enrollee> saveAll(List<Enrollee> t) {
        return repository.saveAll(t);
    }

    @Override
    public Optional<Enrollee> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Enrollee> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
