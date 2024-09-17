package com.example.security.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UserInfoResponse {

    private Long userId;
    private String userName;
    private String email;
    private String password;
    private boolean accountNonLocked;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;
    private boolean enabled;
    private LocalDate credentialsExpiryDate;
    private LocalDate accountExpiryDate;
    private String twoFactorSecret;
    private boolean isTwoFactorEnabled;
    private String signUpMethod;
    private List<String> roles;

    public UserInfoResponse(Long id, String username, String email, boolean accountNonLocked, boolean accountNonExpired,
                            boolean credentialsNonExpired, boolean enabled, LocalDate credentialsExpiryDate,
                            LocalDate accountExpiryDate, boolean isTwoFactorEnabled, List<String> roles) {
        this.userId = id;
        this.userName = username;
        this.email = email;
        this.accountNonLocked = accountNonLocked;
        this.accountNonExpired = accountNonExpired;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
        this.credentialsExpiryDate = credentialsExpiryDate;
        this.accountExpiryDate = accountExpiryDate;
        this.isTwoFactorEnabled = isTwoFactorEnabled;
        this.roles = roles;
    }
}
