package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) {

//        for (int i=0; i<10; i++)
//            if (i % 2 == 0)
//            System.out.println("test");

        try {
            while (true) {
                int askiiCode = System.in.read();
                System.out.printf("ASKII: %s",askiiCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
