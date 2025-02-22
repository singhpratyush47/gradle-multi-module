package com.multi_module.service;

import com.multi_module.entity.StudentEntity;
import com.multi_module.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HelloService {

    public String helloWorld();

    public List<StudentEntity> getStudents();

    public List<User> saveUsers(List<User> userList);
}
