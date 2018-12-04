package edu.csumb.cst438.userservice.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import edu.csumb.cst438.userservice.api.entities.User;
import edu.csumb.cst438.userservice.data.UserRepository;

@Component
public class UserDbSeeder implements CommandLineRunner{

    @Autowired
    UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        User admin1 = new User("admin1", "admin1", 1000.2);
        User admin2 = new User("admin2", "admin2", 500.2);
        User admin3 = new User("admin3", "admin3", 24.5);


        // delete db data
        userRepo.deleteAll();
        // add db seed
        List<User> users = Arrays.asList(admin1,admin2,admin3);
        userRepo.saveAll(users);
    }

}