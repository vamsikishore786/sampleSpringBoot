package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {
    Student findName(String name);

    void save(Student student);
}
