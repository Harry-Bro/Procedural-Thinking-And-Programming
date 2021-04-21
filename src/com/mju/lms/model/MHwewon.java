package com.mju.lms.model;

public class MHwewon {

    private int id;
    private String name;
    private String address;
    private int hwakgwa;

    public MHwewon(int id, String name, String address, int hwakgwa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hwakgwa = hwakgwa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + address + " " + hwakgwa;
    }
}