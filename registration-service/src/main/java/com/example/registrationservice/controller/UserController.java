package com.example.registrationservice.controller;

import com.example.registrationservice.dao.UserRepository;

import com.example.registrationservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody Employee employee) {
        repository.save(employee);
        return "Hi " + employee.getName() + " your Registration process successfully completed";
    }

    @GetMapping("/getAllUsers")
    public List<Employee> findAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/findUser/{email}")
    public List<Employee> findUser(@PathVariable String email) {
        return repository.findByEmail(email);
    }

    @DeleteMapping("/cancel/{id}")
    public List<Employee> cancelRegistration(@PathVariable int id) {
        repository.deleteById(id);
        return repository.findAll();
    }
}
