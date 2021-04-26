package com.mju.lms.view;

import com.mju.lms.valueObject.OHwewon;
import java.util.Scanner;

public class VInitial {

    private VLogin vLogin;
    private VHwewonDeungrok vhwewonDeungrok;
    private VHwewonJungBo vHwewonJungBo;

    private OHwewon loggedIn;

    public VInitial() {
        this.vLogin = new VLogin();
        this.vhwewonDeungrok = new VHwewonDeungrok();
        this.vHwewonJungBo = new VHwewonJungBo();
        loggedIn = null;
    }

    public void show() {
        while (true) {
            System.out.println("=====================================");
            System.out.println("다음 기능을 선택 하세요.");
            System.out.println("로그인(1), 회원등록(2), 회원정보(3), 종료(4)");
            Scanner sc = new Scanner(System.in);
            int input = Integer.parseInt(sc.nextLine());
            if (input == 1) {
                this.loggedIn = vLogin.show();
                if (this.loggedIn == null) {
                    System.out.println("로그인 실패.");
                    System.out.println("아이디 또는 패스워드를 확인해주세요.");
                } else {
                    System.out.println("로그인 성공.");
                }
            } else if (input == 2) {
                vhwewonDeungrok.show();
            } else if (input == 3) {
                if (loggedIn == null) {
                    System.out.println("로그인을 해주세요.");
                    continue;
                }
                vHwewonJungBo.show(this.loggedIn);
            } else {
                break;
            }
        }
    }

}
