package com.example.enrolleeservice.core;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseController<T, I> {

    private final BaseService<T, I> service;

    protected BaseController(BaseService<T, I> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody T t) {
        return ResponseEntity.ok(service.save(t));
    }

    @PostMapping("/all")
    public ResponseEntity<?> saveAll(@RequestBody List<T> t) {
        return ResponseEntity.ok(service.saveAll(t));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOne(@PathVariable I id) {
        Optional<T> t = service.findOne(id);

        if (!t.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(t.get());
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable I id) {
        service.deleteById(id);

        return ResponseEntity.ok().build();
    }
}
