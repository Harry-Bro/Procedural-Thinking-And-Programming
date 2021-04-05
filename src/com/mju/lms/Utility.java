package com.mju.lms;

import java.io.IOException;

public class Utility {

    public static char[] readInt() throws IOException {
        char[] inputArray = new char[10];
        int index = 0;
        inputArray[index] = (char) System.in.read();
        while (inputArray[index] >= '0' && inputArray[index] <= '9') {
            index++;
            inputArray[index] = (char) System.in.read();
        }

        inputArray[index] = 0;
        return inputArray;
    }

    public static int length(char[] inputArray) {
        int length = 0;
        while (inputArray[length] != 0)
            length++;

        return length;
    }

}
