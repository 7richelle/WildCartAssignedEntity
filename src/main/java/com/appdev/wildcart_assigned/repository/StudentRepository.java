package com.appdev.wildcart_assigned.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.appdev.wildcart_assigned.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}