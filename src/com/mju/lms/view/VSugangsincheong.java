package com.mju.lms.view;

import com.mju.lms.control.CHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLecture;

import java.util.Scanner;

public class VSugangsincheong {

    private Scanner sc;
    private OHwewon loggedIn;
    private VIndex vCampus;
    private VIndex vCollege;
    private VDepartment vDepartment;
    private VLecture vLecture;
    private CHwewon cHwewon;

    public VSugangsincheong(Scanner sc, OHwewon loggedIn) {
        this.sc = sc;
        this.loggedIn = loggedIn;
        this.vCampus = new VCampus(sc);
        this.vCollege = new VCollege(sc);
        this.vDepartment = new VDepartment(sc);
        this.vLecture = new VLecture(sc);
        this.cHwewon = new CHwewon();
    }

    public void show() {
        System.out.println(this.loggedIn.getName() + "님 안녕하세요!");
        System.out.println("=========== 수강신청 화면 ===========");
        String fileName = this.vCampus.show("root");
        fileName = this.vCollege.show(fileName);
        fileName = this.vDepartment.show(fileName);
        OLecture oLecture = this.vLecture.show(fileName);
        System.out.println("선택한 강좌는 " + oLecture.getName() + "입니다.");
        System.out.println("다음 기능을 선택하세요.");
        System.out.println("미리담기(1) 수강신청(2) 종료(3)");
        String input = this.sc.next();
        if (input.equals("1")) {
            if (this.cHwewon.readJanbaguni(this.loggedIn).contains(oLecture))
                System.out.println("이미 장바구니에 담긴 강좌입니다.");
            else this.cHwewon.saveMiridamgi(this.loggedIn, oLecture);
        } else if (input.equals("2")) {

        }
    }

}
