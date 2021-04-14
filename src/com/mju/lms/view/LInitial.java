package com.mju.lms.view;

import com.mju.lms.db.DB;
import com.mju.lms.model.LHwewon;

import java.util.List;
import java.util.Scanner;

public class LInitial {

    private LHwewonDeungrok hwewonDeungrok;

    public LInitial() {
        this.hwewonDeungrok = new LHwewonDeungrok();
    }

    public void show() {
        System.out.println("LInitial::show");
        System.out.println("다음 기능을 선택하세요.");
        System.out.println("로그인(1), 회원등록(2), 전체회원(3)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            // login dialog show
        } else if (input == 2) {
            this.hwewonDeungrok.show();
        } else if (input == 3) {
            this.printAllHwewon();
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    private void printAllHwewon() {
        DB db = DB.getInstance();
        List<LHwewon> lHwewons = db.getlHwewons();
        for (LHwewon hwewon : lHwewons) {
            System.out.printf("아이디: %-5s 이름: %-5s 주소: %-5s 학과: %-5s\n",
                    hwewon.getId(), hwewon.getName(), hwewon.getAddress(), hwewon.getHwakgwa());
        }
    }

}
