package com.example.security.request;

import com.example.security.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {

    @NotBlank
    private String username;
    @NotBlank
    @Email
    private String email;
    private Set<String> role;
    @NotBlank
    private String password;
}
