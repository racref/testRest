package com.api.test.controller;

import com.api.test.entity.NamesEntity;
import com.api.test.services.ITableTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    ITableTestService tableTestService;

    @GetMapping
    public String getTest() {
        return "test!";
    }

    @GetMapping("/all")
    public List<NamesEntity> getAllFromTableTest() {
        return tableTestService.getAll();
    }
}