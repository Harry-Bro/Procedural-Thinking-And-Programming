package com.mju.lms.valueObject;

public class OLogin {

    private String id;
    private String password;

    public OLogin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
