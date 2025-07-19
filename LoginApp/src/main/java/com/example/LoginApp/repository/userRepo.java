package com.example.LoginApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.LoginApp.model.user;

public interface userRepo extends MongoRepository<user, String> {
    //custom queries can be implemented here if needed
}
