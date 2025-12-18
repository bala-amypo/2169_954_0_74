package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService service;

    // ADD
    @PostMapping("/add")
    public UserEntity addStudent(@RequestBody UserEntity student) {
        return service.addStudent(student);
    }

    // GET ALL
    @GetMapping("/all")
    public List<UserEntity> getAllStudents() {
        return service.getAllStudents();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public UserEntity getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public UserEntity updateStudent(
            @PathVariable Long id,
            @RequestBody StudentEntity student) {
        return service.updateStudent(id, student);
    }
}
