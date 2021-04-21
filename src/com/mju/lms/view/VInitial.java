package com.mju.lms.view;

import java.util.Scanner;

public class VInitial {

    private VHwewonDeungrok vhwewonDeungrok;
    private VHwewonJungBo vHwewonJungBo;

    private boolean loggedIn;

    public VInitial() {
        this.vhwewonDeungrok = new VHwewonDeungrok();
        this.vHwewonJungBo = new VHwewonJungBo();
        loggedIn = false;
    }

    public void show() {
        System.out.println("다음 기능을 선택 하세요.");
        System.out.println("로그인(1), 회원등록(2), 회원정보(3)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {

        } else if (input == 2) {
            vhwewonDeungrok.show();
        } else if (input == 3) {
            if (!loggedIn) {
                System.out.println("로그인을 해주세요.");
            }

        }

    }

}
