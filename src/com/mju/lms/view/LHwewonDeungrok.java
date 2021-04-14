package com.mju.lms.view;

import com.mju.lms.db.DB;
import com.mju.lms.main.LMain;
import com.mju.lms.model.LHwewon;

import java.util.List;
import java.util.Scanner;

public class LHwewonDeungrok {

    private final DB db;
    private final List<LHwewon> lHwewons;

    public LHwewonDeungrok() {
        db = DB.getInstance();
        lHwewons = db.getlHwewons();
    }

    public void show() {
        System.out.println("LHwewonDeungrok::show");
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요 ==> ");
        String id = sc.nextLine();
        System.out.print("이름를 입력해주세요 ==> ");
        String name = sc.nextLine();
        System.out.print("주소를 입력해주세요 ==> ");
        String address = sc.nextLine();
        System.out.print("학과를 입력해주세요 ==> ");
        String hwakgwa = sc.nextLine();
        LHwewon hwewon = new LHwewon(id, name, address, hwakgwa);
        lHwewons.add(hwewon);
        System.out.println("회원가입 완료");
        System.out.println("다시 메인 화면으로 돌아갑니다.");
        LMain main = new LMain();
        main.run();
    }
}
