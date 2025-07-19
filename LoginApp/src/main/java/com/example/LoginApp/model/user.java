package com.example.LoginApp.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class user {
    @Id
    private String id;
    private String username;
    private String password;
}
