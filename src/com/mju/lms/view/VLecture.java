package com.mju.lms.view;

import com.mju.lms.control.CLecture;
import com.mju.lms.valueObject.OLecture;

import java.util.Scanner;
import java.util.Vector;

public class VLecture {

    private Scanner sc;
    private CLecture cLecture;

    public VLecture(Scanner sc) {
        this.sc = sc;
        this.cLecture = new CLecture();
    }

    public OLecture show(String fileName) {
        System.out.println("강좌를 선택해주세요. ");
        Vector<OLecture> lectures = this.cLecture.getAll(fileName);
        lectures.forEach(System.out::println);
        String id = sc.next();
        return lectures.stream()
                .filter(lecture -> lecture.getId().equals(id))
                .findFirst()
                .orElseGet(() -> null);
    }
}
