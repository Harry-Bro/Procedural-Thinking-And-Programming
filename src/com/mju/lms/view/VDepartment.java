package com.mju.lms.view;

import java.util.Scanner;

public class VDepartment extends VIndex {

    public VDepartment(Scanner sc) {
        super(sc);
    }

    @Override
    public String show(String fileName) {
        System.out.println("학과를 선택해주세요. ");
        return super.show(fileName);
    }

}
