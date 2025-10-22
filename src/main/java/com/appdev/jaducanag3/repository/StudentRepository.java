package com.appdev.jaducanag3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.jaducanag3.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}