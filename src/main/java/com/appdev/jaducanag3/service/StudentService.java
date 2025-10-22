package com.appdev.jaducanag3.service;

import org.springframework.stereotype.Service;

import com.appdev.jaducanag3.model.Student;
import com.appdev.jaducanag3.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
   private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAllStudents() { return repo.findAll(); }
    public Student addStudent(Student s) { return repo.save(s); }
    public Student getStudentById(int id) { return repo.findById(id).orElse(null); }
    public Student updateStudent(int id, Student newStudent) {
        return repo.findById(id).map(student -> {
            student.setFname(newStudent.getFname());
            student.setLname(newStudent.getLname());
            student.setEmail(newStudent.getEmail());
            student.setPassword(newStudent.getPassword());
            student.setRole(newStudent.getRole());
            student.setContact_number(newStudent.getContact_number());
            return repo.save(student);
        }).orElse(null);
    }
    public void deleteStudent(int id) { repo.deleteById(id); }
}
