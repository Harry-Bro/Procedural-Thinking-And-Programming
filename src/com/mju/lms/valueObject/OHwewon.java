package com.mju.lms.valueObject;

import com.mju.lms.model.MHwewon;

public class OHwewon extends OModel {

    private String id;
    private String password;
    private String name;
    private String address;
    private String hwakgwa;

    public OHwewon() {
    }

    public OHwewon(String id, String password, String name, String address, String hwakgwa) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.hwakgwa = hwakgwa;
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

    public void setPassword(String password) {
        this.password = password;
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

    public String getHwakgwa() {
        return hwakgwa;
    }

    public void setHwakgwa(String hwakgwa) {
        this.hwakgwa = hwakgwa;
    }

    public MHwewon toEntity() {
        return new MHwewon(this.getId(), this.password, this.getName(), this.getAddress(), this.getHwakgwa());
    }

//    public void set(MHwewon mHwewon) {
//        this.id = mHwewon.getId();
//        this.password = mHwewon.getPassword();
//        this.name = mHwewon.getName();
//        this.address = mHwewon.getAddress();
//        this.hwakgwa = mHwewon.getHwakgwa();
//    }
}
