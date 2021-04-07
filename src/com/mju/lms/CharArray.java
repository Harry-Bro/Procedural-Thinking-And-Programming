package com.mju.lms;

import java.io.IOException;

public class CharArray {
    // attributes
    private int length;

    // components
    private char[] buffer;

    // constructors
    public CharArray() {
        this.buffer = new char[10];
    }

    // methods
    public char[] read() throws IOException {
        this.length = 0;
        this.buffer[length] = (char) System.in.read();
        while (this.buffer[length] != 10) {
            length++;
            this.buffer[length] = (char) System.in.read();
        }

        this.buffer[length] = 0;
        return this.buffer;
    }

    public int charToInt() throws IOException {
        int result = 0;
        int multiplier = 1;
        for (int i = this.length - 1; i >= 0; i--) {
            result += (this.buffer[i] - '0') * multiplier;
            multiplier *= 10;
        }

        return result;
    }


}
