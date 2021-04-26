package com.mju.lms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./hwewon.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }

}
