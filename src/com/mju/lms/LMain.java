package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        char[] inputArray = Utility.readInt();
        int length = Utility.length(inputArray);
        System.out.println("length: " + length);
        int result = Integer.charArrayToInt(inputArray);
        System.out.println("charToInt Result: " + result);
        char[] outputArray = CharArray.intToCharArray(result, length);
        System.out.print("inToChar Result: ");
        for (int i = 0; i < length; i++) {
            System.out.print(outputArray[i]);
        }
    }

}
