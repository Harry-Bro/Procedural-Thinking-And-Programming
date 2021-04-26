package com.mju.lms.view;

import com.mju.lms.control.CHwewonDeungrok;
import com.mju.lms.valueObject.OHwewon;
import java.util.Scanner;

public class VHwewonJungBo {

    public VHwewonJungBo() {
    }

    public void show(OHwewon loggedIn) {
        System.out.printf("학번: %s | ", loggedIn.getId());
        System.out.printf("이름: %s | ", loggedIn.getName());
        System.out.printf("주소: %s | ", loggedIn.getAddress());
        System.out.printf("학과번호: %s\n", loggedIn.getHwakgwa());
    }

}
