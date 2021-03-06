package com.sbrw.auth.model.data.in;

import javax.validation.constraints.NotNull;

/**
 * Auth request
 */
public class AuthRequest {

    @NotNull
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
