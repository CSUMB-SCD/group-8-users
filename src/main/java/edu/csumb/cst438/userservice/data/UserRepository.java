package edu.csumb.cst438.userservice.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.csumb.cst438.userservice.api.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
    @Query (value = "{'id':?0}")   
    User findByRepoId(String id);

    @Query (value = "{'Name':?0}")
    List<User> findByName(String Name);
}