package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        int result = charToInt();
        char[] chars = intToChar(result);
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 0)
                continue;
            System.out.printf("%s", chars[i]);
        }
    }

    public static int charToInt() throws IOException {
        int[] inputArray = new int[10];
        int index = 0;
        inputArray[index] = System.in.read();
        while (inputArray[index] >= '0' && inputArray[index] <= '9') {
            index++;
            inputArray[index] = System.in.read();
        }

        int result = 0;
        int multiplier = 1;
        for (int i = index - 1; i >= 0; i--) {
            result += (inputArray[i] - '0') * multiplier;
            multiplier *= 10;
        }
//        System.out.println(result);

        return result;
    }

    public static char[] intToChar(int result) {
        int quotient = result;
        int[] remainders = new int[10];
        int index = 0;
        while (quotient > 0) {
            remainders[index] = quotient % 10;
            quotient /= 10;
            index++;
        }

        char[] charOutput = new char[10];
        for (int i = 0; i < index; i++)
            charOutput[i] = (char) (remainders[i] + '0');

        return charOutput;
    }

}
