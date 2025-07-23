package com.example.LoginApp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.LoginApp.model.user;

public interface userRepo extends MongoRepository<user, String> {

    Optional<user> findByUsername(String username);
    //custom queries can be implemented here if needed
}
