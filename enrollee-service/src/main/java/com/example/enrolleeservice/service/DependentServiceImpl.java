package com.example.enrolleeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.enrolleeservice.entity.Dependent;
import com.example.enrolleeservice.repository.DependentRepository;

@Service
public class DependentServiceImpl implements DependentService {

    private final DependentRepository repository;

    public DependentServiceImpl(
        DependentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Dependent save(Dependent dependent) {
        return repository.save(dependent);
    }

    @Override
    public List<Dependent> saveAll(List<Dependent> t) {
        return repository.saveAll(t);
    }

    @Override
    public Optional<Dependent> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Dependent> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
