package com.appdev.wildcart_assigned.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    private String fname;
    private String lname;
    private String email;
    private String password;
    private String role;
    private String contact_number;

    // Getters and Setters
    public int getStudent_id() { return student_id; }
    public void setStudent_id(int student_id) { this.student_id = student_id; }

    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }
    public void setLname(String lname) { this.lname = lname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getContact_number() { return contact_number; }
    public void setContact_number(String contact_number) { this.contact_number = contact_number; }
}
