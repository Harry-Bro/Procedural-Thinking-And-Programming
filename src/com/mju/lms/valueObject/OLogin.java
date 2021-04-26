package com.mju.lms.valueObject;

public class OLogin {

    private int id;
    private String password;

    public OLogin(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
