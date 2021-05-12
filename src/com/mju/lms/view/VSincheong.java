package com.mju.lms.view;

import com.mju.lms.control.CHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLecture;

import java.util.Scanner;
import java.util.Vector;

public class VSincheong {
    private Scanner sc;
    private OHwewon loggedIn;
    private CHwewon cHwewon;

    public VSincheong(Scanner sc, OHwewon loggedIn) {
        this.sc = sc;
        this.loggedIn = loggedIn;
        this.cHwewon = new CHwewon();
    }

    public void show() {
        Vector<OLecture> sincheongList = this.cHwewon.readSinCheong(this.loggedIn);
        sincheongList.forEach(System.out::println);
        System.out.println("강좌를 선택해주세요.");
        String lectureNo = sc.next();
        System.out.println("(1) 수강철회 (2) 취소");
        String input = sc.next();
        OLecture lecture = null;
        for (OLecture l : sincheongList) {
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
            sincheongList.remove(lecture);
            this.cHwewon.removeSincheong(this.loggedIn, lecture);
            System.out.println("해당 강좌를 수강 철회했습니다.");
        }
    }
}
