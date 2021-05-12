package com.mju.lms.view;

import com.mju.lms.control.CHwewon;
import com.mju.lms.valueObject.OHwewon;
import java.util.Scanner;

public class VHwewonDeungrok {

    private CHwewon cHwewon;
    private Scanner sc;

    public VHwewonDeungrok() {
        this.cHwewon = new CHwewon();
        this.sc = new Scanner(System.in);
    }

    public void show() {
        // 사용자 정보 입력받아 oHwewon에 저장.
        System.out.print("아이디을 입력해주세요. ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요. ");
        String password = sc.nextLine();
        System.out.print("이름을 입력해주세요. ");
        String name = sc.nextLine();
        System.out.print("주소를 입력해주세요. ");
        String address = sc.nextLine();
        System.out.print("학과를 입력해주세요. ");
        String hwakgwa = sc.nextLine();
        OHwewon oHwewon = new OHwewon(id, password, name, address, hwakgwa);

        this.cHwewon.saveHwewon(oHwewon);
    }
}
