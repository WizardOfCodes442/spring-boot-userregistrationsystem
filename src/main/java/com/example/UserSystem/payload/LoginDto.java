package com.example.UserSystem.payload;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class LoginDto {

    private String usernameOrEmail;
    private String password;

    // Explicit getter for usernameOrEmail
    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    // Explicit setter for usernameOrEmail
    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    // Explicit getter for password
    public String getPassword() {
        return password;
    }

    // Explicit setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
