package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        CharArray charArray = new CharArray();
        char[] read = charArray.read();
        int result = charArray.charToInt();
        System.out.println(result);

        Integer myInteger = new Integer();
        int length = myInteger.length(read);
        char[] chars = myInteger.intToChar(result, length);
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }
    }

}
