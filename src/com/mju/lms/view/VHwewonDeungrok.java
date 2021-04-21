package com.mju.lms.view;

import com.mju.lms.control.CHwewonDeungrok;
import com.mju.lms.valueObject.OHwewon;
import java.util.Scanner;

public class VHwewonDeungrok {

    private CHwewonDeungrok cHwewonDeungrok;
    private Scanner sc;

    public VHwewonDeungrok() {
        this.cHwewonDeungrok = new CHwewonDeungrok();
        this.sc = new Scanner(System.in);
    }

    public void show() {
        // 사용자 정보 입력받아 oHwewon에 저장.
        System.out.print("학번을 입력해주세요. ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("이름을 입력해주세요. ");
        String name = sc.nextLine();
        System.out.print("주소를 입력해주세요. ");
        String address = sc.nextLine();
        System.out.print("학과 번호를 입력해주세요. ");
        int hwakgwa = sc.nextInt();
        OHwewon oHwewon = new OHwewon(id, name, address, hwakgwa);

        this.cHwewonDeungrok.saveHwewon(oHwewon);
    }
}
