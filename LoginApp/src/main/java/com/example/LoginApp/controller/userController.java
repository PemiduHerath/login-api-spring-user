package com.example.LoginApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.LoginApp.dto.loginRequest;
import com.example.LoginApp.model.user;
import com.example.LoginApp.repository.userRepo;


@Controller
public class userController {
    @Autowired
    private userRepo repo;

    @GetMapping("/") //showing the initial page
    public String showLog() {
        return "login"; // returns the login.html template
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody loginRequest loginRequest) {
        Optional<user> userOpt = repo.findByUsername(loginRequest.getUsername());
        if (userOpt.isPresent()) {
            user foundUser = userOpt.get();
            if (foundUser.getPassword().equals(loginRequest.getPassword())) {
                return ResponseEntity.ok().build(); // Login success
            } else {
                return ResponseEntity.status(401).body("{\"message\":\"Invalid password\"}");
            }
        } else {
            return ResponseEntity.status(401).body("{\"message\":\"User not found\"}");
        }
    }
    
}
