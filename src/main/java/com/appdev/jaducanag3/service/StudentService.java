package com.appdev.wildcart_assigned.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.appdev.wildcart_assigned.model.Student;
import com.appdev.wildcart_assigned.repository.StudentRepository;

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
