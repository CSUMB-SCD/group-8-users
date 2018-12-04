package edu.csumb.cst438.userservice.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.userservice.api.entities.User;

@Repository
public class UserDbClient {

    @Autowired
    UserRepository repository;
    
    public List<User> getAll(){
        return repository.findAll();
    }

	public boolean save(User newUser) {
        repository.save(newUser);
		return true;
	}
}