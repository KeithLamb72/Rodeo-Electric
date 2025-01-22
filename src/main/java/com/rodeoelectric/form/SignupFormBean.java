package com.rodeoelectric.form;

import com.rodeoelectric.validation.EmailUnique;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
//
//@Getter
//@Setter
public class SignupFormBean {
    @EmailUnique(message = "Username is already in use.")
    @NotEmpty( message = "Username is required.")
    private String username;

    @NotEmpty(message="Password is required.")
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

