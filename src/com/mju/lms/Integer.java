package com.mju.lms;

public class Integer {

    public int length(char[] inputArray) {
        int length = 0;
        while (inputArray[length] != 0)
            length++;

        return length;
    }

    public char[] intToChar(int result, int length) {
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
