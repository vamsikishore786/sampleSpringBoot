package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public Student getStudentByName(@RequestParam("name") String name){
        return studentService.findName(name);
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentService.save(student);
        return "saved " + student.getName() + " successfully";
    }
}
