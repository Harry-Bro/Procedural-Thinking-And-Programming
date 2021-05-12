package com.mju.lms.view;

import com.mju.lms.valueObject.OHwewon;

import java.util.Scanner;

public class VInitial {

    private VLogin vLogin;
    private VHwewonDeungrok vhwewonDeungrok;
    private VHwewonJungBo vHwewonJungBo;
    private VSugangsincheong vSugangsincheong;
    private VJanbaguni vJanbaguni;
    private VSincheong vSincheong;
    private Scanner sc;
    private OHwewon loggedIn;

    public VInitial(Scanner sc) {
        this.vLogin = new VLogin();
        this.vhwewonDeungrok = new VHwewonDeungrok();
        this.vHwewonJungBo = new VHwewonJungBo();
        loggedIn = null;
        this.sc = sc;
    }

    public void show() {
        while (true) {
            System.out.println("=====================================");
            System.out.println("다음 기능을 선택 하세요.");
            String input = "";
            if (this.loggedIn == null) {
                System.out.println("로그인(1), 회원등록(2), 종료(3)");
                input = sc.next();
                if (input.equals("1")) {
                    this.loggedIn = vLogin.show();
                    if (this.loggedIn == null) {
                        System.out.println("로그인 실패.");
                        System.out.println("아이디 또는 패스워드를 확인해주세요.");
                    }
                } else if (input.equals("2")) {
                    vhwewonDeungrok.show();
                } else {
                    break;
                }
            } else {
                System.out.println("회원정보(1), 수강신청(2), 장바구니(3), 수강신청내역(4), 종료(5)");
                input = sc.next();
                if (input.equals("1")) {
                    vHwewonJungBo.show(this.loggedIn);
                } else if (input.equals("2")) {
                    this.vSugangsincheong = new VSugangsincheong(this.sc, loggedIn);
                    this.vSugangsincheong.show();
                } else if (input.equals("3")) {
                    this.vJanbaguni = new VJanbaguni(this.sc, loggedIn);
                    this.vJanbaguni.show();
                } else if (input.equals("4")) {
                    this.vSincheong = new VSincheong(this.sc, loggedIn);
                    this.vSincheong.show();
                } else {
                    break;
                }
            }
        }
    }

}
