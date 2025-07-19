package com.example.LoginApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data // getters and setters are created through this annotation
public class loginRequest {
    @NotBlank(message = "Username is required") //validation username
    private String username;
    @NotBlank(message = "Password is required") //validation password
    private String password;
}
