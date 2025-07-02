package com.example.SimpleFormApplication.demo.repository;

import com.example.SimpleFormApplication.demo.model.FormData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormDataRepository extends JpaRepository<FormData,Long> {
}
