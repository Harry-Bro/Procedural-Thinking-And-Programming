package com.mju.lms.model;

import com.mju.lms.valueObject.OLecture;

import java.io.PrintWriter;

public class MHwewon extends MModel {

    private String id;
    private String password;
    private String name;
    private String address;
    private String hwakgwa;

    public MHwewon() {
    }

    public MHwewon(String id, String password, String name, String address, String hwakgwa) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.hwakgwa = hwakgwa;
    }

    public void save(PrintWriter printWriter, OLecture oLecture) {
        printWriter.println(oLecture.toString());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHwakgwa() {
        return hwakgwa;
    }

    @Override
    public String toString() {
        return id + "\n" + password + "\n" + name + "\n" + address + "\n" + hwakgwa;
    }

}