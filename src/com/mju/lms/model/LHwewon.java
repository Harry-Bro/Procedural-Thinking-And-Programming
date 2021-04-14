package com.mju.lms.model;

public class LHwewon {

    private String id;
    private String name;
    private String address;
    private String hwakgwa;

    public LHwewon(String id, String name, String address, String hwakgwa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hwakgwa = hwakgwa;
    }

    public String getId() {
        return id;
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
}
