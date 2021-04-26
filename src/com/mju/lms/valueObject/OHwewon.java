package com.mju.lms.valueObject;

import com.mju.lms.model.MHwewon;

public class OHwewon {

    private int id;
    private String password;
    private String name;
    private String address;
    private int hwakgwa;

    public OHwewon() {
    }

    public OHwewon(int id, String password, String name, String address, int hwakgwa) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.hwakgwa = hwakgwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHwakgwa() {
        return hwakgwa;
    }

    public void setHwakgwa(int hwakgwa) {
        this.hwakgwa = hwakgwa;
    }

    public MHwewon toEntity() {
        return new MHwewon(this.getId(), this.password, this.getName(), this.getAddress(), this.getHwakgwa());
    }

}
