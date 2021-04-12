package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        CharArray charArray = new CharArray();
        charArray.read();
        int result = charArray.charToInt();
        System.out.println(result);

        Integer number = new Integer(result);
        char[] chars = number.intToChar();
        System.out.println(chars);
    }

}
