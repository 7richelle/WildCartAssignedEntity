package com.appdev.wildcart_assigned.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.appdev.wildcart_assigned.model.Student;
import com.appdev.wildcart_assigned.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
     private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() { return service.getAllStudents(); }

    @PostMapping
    public Student addStudent(@RequestBody Student student) { return service.addStudent(student); }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) { return service.getStudentById(id); }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student newStudent) {
        return service.updateStudent(id, newStudent);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student deleted with ID: " + id;
    }
}
