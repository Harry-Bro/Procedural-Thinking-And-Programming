package com.mju.lms.view;

import java.util.Scanner;

public class VCampus extends VIndex {

    public VCampus(Scanner sc) {
        super(sc);
    }

    @Override
    public String show(String fileName) {
        System.out.println("소속 캠퍼스를 선택하세요. ");
        return super.show(fileName);
    }

}
