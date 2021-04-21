package com.mju.lms.main;

import com.mju.lms.view.VInitial;

public class LMain {

    private VInitial initial;

    public LMain() {
        this.initial = new VInitial();
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
