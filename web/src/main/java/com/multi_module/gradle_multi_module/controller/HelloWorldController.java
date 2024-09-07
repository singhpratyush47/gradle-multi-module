package com.multi_module.gradle_multi_module.controller;

import com.multi_module.entity.StudentEntity;
import com.multi_module.service.HelloService;
import com.multi_module.service.HelloServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    HelloService helloService=new HelloServiceImpl();

    @GetMapping("/world")
    public String sayHello() {
        return helloService.helloWorld();
    }

    @GetMapping("/students")
   public List<StudentEntity> getStudents(){
        return helloService.getStudents();
   }

}
