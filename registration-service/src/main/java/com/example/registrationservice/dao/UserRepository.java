package com.example.registrationservice.dao;


import com.example.registrationservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<Employee,Integer> {
    List<Employee> findByEmail(String email);
}