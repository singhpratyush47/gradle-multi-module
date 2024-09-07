package com.multi_module.service;

import com.multi_module.entity.StudentEntity;

import java.util.List;

public class HelloServiceImpl implements HelloService{

    @Override
    public String helloWorld() {
        return "Hello World!! How are u guys!!";
    }

    @Override
    public List<StudentEntity> getStudents(){
        return List.of(new StudentEntity("Pratyush",31,100),new StudentEntity("Khushi",1,10)
                ,new StudentEntity("Nisha",78,987));
    }
}
