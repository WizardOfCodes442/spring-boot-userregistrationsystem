package com.example.UserSystem.payload;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class SignUpDto {

    private String name;
    private String username;
    private String email;
    private String password;
    private String sid;

    // Explicit getter for name
    public String getName() {
        return name;
    }

    // Explicit setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Explicit getter for username
    public String getUsername() {
        return username;
    }

    // Explicit setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Explicit getter for email
    public String getEmail() {
        return email;
    }

    // Explicit setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Explicit getter for password
    public String getPassword() {
        return password;
    }

    //Explicit getter for ssid 
    public String getSid()
    {
    	return sid;
    }
    
    //Explicit Setter for sid
    public void setSid(String sid) {
    	this.sid = sid;
    }
}
