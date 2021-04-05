package com.mju.lms;

import java.io.IOException;

public class Integer {

    public static int charArrayToInt(char[] inputArray) throws IOException {
        int result = 0;
        int multiplier = 1;
        int length = Utility.length(inputArray);
        for (int i = length - 1; i >= 0; i--) {
            result += (inputArray[i] - '0') * multiplier;
            multiplier *= 10;
        }

        return result;
    }

}
