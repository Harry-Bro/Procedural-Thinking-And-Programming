package com.mju.lms.view;

import com.mju.lms.control.CHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLecture;

import java.util.Scanner;
import java.util.Vector;

public class VJanbaguni {

    private Scanner sc;
    private OHwewon loggedIn;
    private CHwewon cHwewon;

    public VJanbaguni(Scanner sc, OHwewon loggedIn) {
        this.sc = sc;
        this.loggedIn = loggedIn;
        this.cHwewon = new CHwewon();
    }

    public void show() {
        Vector<OLecture> janbaguniList = this.cHwewon.readJanbaguni(this.loggedIn);
        janbaguniList.forEach(System.out::println);
    }

}
