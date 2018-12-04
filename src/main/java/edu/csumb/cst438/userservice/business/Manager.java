package edu.csumb.cst438.userservice.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.cst438.userservice.api.entities.User;
import edu.csumb.cst438.userservice.data.UserDbClient;

@Service
public class Manager{
    @Autowired
    UserDbClient userDbClient;
    
    public List<User> getUserList(){
        return userDbClient.getAll();
    }

    public User validate(User payload){
        User result = new User();
        for (User user: userDbClient.getAll()) {
            if (user.getPassword().equals(payload.getPassword())
             && user.getUsername().equals(payload.getUsername())) {
                result = user;
                break;
            }
        }
        return result;
    }

    public Boolean setCredits(User payload){
        return userDbClient.save(payload);
    }
}