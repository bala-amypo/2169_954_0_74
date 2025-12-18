package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.UserEntity;

public interface UserService {

    UserEntity addStudent(UserEntity student);

    List<UserEntity> getAllStudents();

    UserEntity getStudentById(Long id);

    UserEntity updateStudent(Long id, UserEntity student);
}
