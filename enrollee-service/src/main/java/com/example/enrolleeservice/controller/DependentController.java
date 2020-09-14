package com.example.enrolleeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enrolleeservice.core.BaseController;
import com.example.enrolleeservice.entity.Dependent;
import com.example.enrolleeservice.service.DependentService;

@RestController
@RequestMapping("/v1/dependent")
public class DependentController extends BaseController<Dependent, Long> {

    protected DependentController(DependentService service) {
        super(service);
    }
}
