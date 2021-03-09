package com.mju.lms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadAssignment {

    public static void main(String[] args) {
        FileReadAssignment fa = new FileReadAssignment();
        Main main = new Main();
        float[] nums = fa.getNums(5);
        float sum = main.sum(nums);
        float average = main.average(nums);

        System.out.println("======= Read File =======");
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }

    private float[] getNums(int size) {
        float[] nums = new float[size];
        try (Scanner sc = new Scanner(new File("./src/com/mju/lms/nums.txt"))) {
            int i = 0;
            while (sc.hasNext()) {
                nums[i] = Float.parseFloat(sc.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return nums;
    }
}
