package edu.csumb.cst438.userservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.csumb.cst438.userservice.api.entities.User;
import edu.csumb.cst438.userservice.business.Manager;

@RestController
public class UserController {
    @Autowired
    Manager manager;

    @GetMapping ("/User")
    @ResponseBody
    List<User> getUsers(){
        return manager.getUserList();
    }

    @GetMapping ("/Product/{Catagory}")
    @ResponseBody
    List<User> getUsers(
            @PathVariable String catagory
        ){
        return manager.getUserList();
    }

    @GetMapping ("/test")
    @ResponseBody
    String getTestString(){
        return "test";
    }

    @GetMapping("/")
    public String home() {
        return "This is a trivial service that demonstrates how a Eureka Client can register with a Eureka Server";
    }
}