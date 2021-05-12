package com.mju.lms.main;

import com.mju.lms.view.VInitial;

import java.util.Scanner;

public class LMain {

    private VInitial initial;
    private Scanner sc;

    public LMain() {
        this.sc = new Scanner(System.in);
        this.initial = new VInitial(sc);
    }

    public void run() {
        this.initial.show();
    }

    public static void main(String[] args) {
        LMain main = new LMain();
        main.run();
        main.sc.close();
    }
}
