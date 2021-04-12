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
    public void read() throws IOException {
        this.length = 0;
        char input = (char) System.in.read();
        // 0x20 = space
        // 0x7E = ~ tilide
        while (input >= 0x20 && input <= 0x7E) {
            this.buffer[length] = input;
            length++;
            input = (char) System.in.read();
        }

        this.buffer[length] = 0;
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

    public int getLength() {
        return length;
    }
}
