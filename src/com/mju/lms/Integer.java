package com.mju.lms;

public class Integer {

    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public int getLength() {
        int temp = this.value;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }

    public char[] intToChar() {
        int index = this.getLength() - 1;
        char[] output = new char[10];
        int result = this.value;
        while (result > 0) {
            output[index] = (char) (result % 10 + '0');
            result /= 10;
            index--;
        }

        return output;
    }

}
