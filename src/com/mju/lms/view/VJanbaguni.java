package com.mju.lms.view;

import com.mju.lms.control.CHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLecture;

import java.util.Scanner;
import java.util.Vector;

public class VJanbaguni {

    private Scanner sc;
    private OHwewon loggedIn;
    private CHwewon cHwewon;

    public VJanbaguni(Scanner sc, OHwewon loggedIn) {
        this.sc = sc;
        this.loggedIn = loggedIn;
        this.cHwewon = new CHwewon();
    }

    public void show() {
        Vector<OLecture> janbaguniList = this.cHwewon.readMiridamgi(this.loggedIn);
        Vector<OLecture> sinCheongList = this.cHwewon.readSinCheong(this.loggedIn);
        janbaguniList.forEach(System.out::println);
        System.out.println("강좌를 선택해주세요.");
        String lectureNo = sc.next();
        System.out.println("(1) 수강신청 (2) 장바구니 삭제 (3) 취소");
        String input = sc.next();
        OLecture lecture = null;
        for (OLecture l : janbaguniList) {
            if (l.getId().equals(lectureNo)) {
                lecture = l;
                break;
            }
        }
        if (lecture == null) {
            System.out.println("해당 강좌가 존재하지 않습니다.");
            return;
        }
        if (input.equals("1")) {
            if (sinCheongList.contains(lecture)) {
                System.out.println("이미 수강 중인 과목입니다.");
            } else {
                this.cHwewon.saveSincheong(this.loggedIn, lecture);
                System.out.println("수강신청 성공.");
            }
        } else if (input.equals("2")) {
            janbaguniList.remove(lecture);
            this.cHwewon.removeMiridamgi(this.loggedIn, lecture);
            System.out.println("장바구니에서 해당 강좌를 삭제했습니다.");
        }

    }

}
