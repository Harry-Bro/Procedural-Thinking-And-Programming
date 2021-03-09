package com.mju.lms;

import java.util.Scanner;

public class Main {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        float[] nums = main.getNums(5);
        float sum = main.sum(nums);
        float average = main.average(nums);

        System.out.println("======= Scanner =======");
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }

    private float[] getNums(int size) {
        float[] num = new float[size];
        for (int i=0; i<5; i++)
            num[i] = sc.nextFloat();

        return num;
    }

    public float sum(float[] nums) {
        float result = 0f;
        for (int i=0; i<nums.length; i++)
            result += nums[i];

        return result;
    }

    public float average(float[] nums) {
        float sum = sum(nums);
        return sum / nums.length;
    }

}
