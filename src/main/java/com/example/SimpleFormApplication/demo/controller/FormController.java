package com.example.SimpleFormApplication.demo.controller;

import com.example.SimpleFormApplication.demo.model.FormData;
import com.example.SimpleFormApplication.demo.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="*,https://forminit.netlify.app/")
@RestController
public class FormController {
    @Autowired
    private FormDataRepository repository;

    @PostMapping("/submit")
    public String handleSubmit(@RequestBody FormData data) {
        repository.save(data);
        return "Form submitted and saved to database!";
    }
}
