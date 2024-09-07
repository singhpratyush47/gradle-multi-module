package com.multi_module.service;

import com.multi_module.entity.StudentEntity;

import java.util.List;

public interface HelloService {

    public String helloWorld();

    public List<StudentEntity> getStudents();
}
