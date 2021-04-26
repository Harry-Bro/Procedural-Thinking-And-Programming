package com.mju.lms.model;

import java.io.PrintWriter;

public class MHwewon {

    private int id;
    private String password;
    private String name;
    private String address;
    private int hwakgwa;

    public MHwewon(int id, String password, String name, String address, int hwakgwa) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.hwakgwa = hwakgwa;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getHwakgwa() {
        return hwakgwa;
    }

    @Override
    public String toString() {
        return id + "\n" + password + "\n" + name + "\n" + address + "\n" + hwakgwa;
    }

    public void save(PrintWriter printWriter) {
        printWriter.println(this.toString());
    }
}