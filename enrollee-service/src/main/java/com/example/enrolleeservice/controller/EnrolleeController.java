package com.example.enrolleeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enrolleeservice.core.BaseController;
import com.example.enrolleeservice.entity.Enrollee;
import com.example.enrolleeservice.service.EnrolleeService;

@RestController
@RequestMapping("v1/enrollee")
public class EnrolleeController extends BaseController<Enrollee, Long> {

    protected EnrolleeController(EnrolleeService service) {
        super(service);
    }
}
