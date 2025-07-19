package com.example.LoginApp.dto;

import lombok.Getter;

@Getter
public class loginResponse {
    private String token;

    public loginResponse(String token) {
        this.token = token;
    }
}
