package com.mju.lms.view;

import java.util.Scanner;

public class VCollege extends VIndex {

    public VCollege(Scanner sc) {
        super(sc);
    }

    @Override
    public String show(String fileName) {
        System.out.println("대학을 선택하세요. ");
        return super.show(fileName);
    }

}
