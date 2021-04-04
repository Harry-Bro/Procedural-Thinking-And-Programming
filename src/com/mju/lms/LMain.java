package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        char[] inputArray = readInt();
        int length = length(inputArray);
        System.out.println("length: " + length);
        int result = charToInt(inputArray);
        System.out.println("charToInt Result: " + result);
        char[] outputArray = intToChar(result, length);
        System.out.print("inToChar Result: ");
        for (int i = 0; i < length; i++) {
            System.out.print(outputArray[i]);
        }
    }

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

    public static int charToInt(char[] inputArray) throws IOException {
        int result = 0;
        int multiplier = 1;
        int length = length(inputArray);
        for (int i = length - 1; i >= 0; i--) {
            result += (inputArray[i] - '0') * multiplier;
            multiplier *= 10;
        }

        return result;
    }

    public static char[] intToChar(int result, int length) {
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
