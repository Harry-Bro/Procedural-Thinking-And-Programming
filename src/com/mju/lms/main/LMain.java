package com.mju.lms.main;

import com.mju.lms.view.LInitial;

public class LMain {

    private LInitial initial;

    public LMain() {
        this.initial = new LInitial();
    }

    public void run() {
        System.out.println("LMain::run");
        this.initial.show();
    }

    public static void main(String[] args) {
        LMain main = new LMain();
        main.run();
    }
}
