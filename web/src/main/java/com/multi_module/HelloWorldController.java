package com.multi_module;

import com.multi_module.entity.StudentEntity;
import com.multi_module.entity.User;
import com.multi_module.service.HelloService;
import com.multi_module.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/world")
    public String sayHello() {
        return helloService.helloWorld();
    }

    @GetMapping("/students")
   public List<StudentEntity> getStudents(){
        return helloService.getStudents();
   }

   @GetMapping("/saveUsers")
   public List<User> saveUsers(){
        return helloService.saveUsers(List.of(new User(1l,"Pratyush Singh"),new User(2l,"Khusi singh")));
   }
}
