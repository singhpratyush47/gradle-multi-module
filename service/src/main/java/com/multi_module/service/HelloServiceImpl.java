package com.multi_module.service;

import com.multi_module.entity.StudentEntity;
import com.multi_module.entity.User;
import com.multi_module.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String helloWorld() {
        return "Hello World!! How are u guys!!";
    }

    @Override
    public List<StudentEntity> getStudents(){
        return List.of(new StudentEntity("Pratyush",31,100),new StudentEntity("Khushi",1,10)
                ,new StudentEntity("Nisha",78,987));
    }

    @Override
    public List<User> saveUsers(List<User> userList) {

        return userList.stream().map(userRepository::save).collect(Collectors.toList());
    }
}
