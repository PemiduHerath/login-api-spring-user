package com.example.LoginApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor 
@Document(collection = "users") //specifies the MongoDB collection name
public class user {
    @Id
    private String id;
    private String username;
    private String password;
}
