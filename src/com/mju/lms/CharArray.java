package com.mju.lms;

public class CharArray {

    public static char[] intToCharArray(int result, int length) {
        char[] output = new char[10];
        int value = result;
        int index = length - 1;
        while (value > 0) {
            output[index] = (char) (value % 10 + '0');
            value /= 10;
            index --;
        }

        return output;
    }

}
