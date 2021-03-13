package com.mju.lms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private Integer[] baseDecimal = { 345, 125, 56, 4592 };
    private String[] hexadecimal = { "aa2", "34f", "3e", "245d" };

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Main main = new Main();
        List<Integer> toBinaryString = main.convert(main.baseDecimal, Integer.class.getMethod("toBinaryString", int.class));
        List<Integer> toHexString = main.convert(main.baseDecimal, Integer.class.getMethod("toHexString", int.class));

        List<String> toBaseDecimal = main.convert(main.hexadecimal, Main.class.getMethod("toBaseDecimal", String.class));
        List<Object> toBinaryString2 = main.convert(toBaseDecimal.toArray(), Integer.class.getMethod("toBinaryString", int.class));

        for (int i = 0; i < toBinaryString.size(); i++)
            System.out.printf("%s: Ob = %s, Ox = %s\n", main.baseDecimal[i], toBinaryString.get(i), toHexString.get(i));
        System.out.println();
        for (int i = 0; i < toBaseDecimal.size(); i++)
            System.out.printf("%s: Dec = %s, Ob = %s\n", main.hexadecimal[i], toBaseDecimal.get(i), toBinaryString2.get(i));

    }

    @SuppressWarnings("unchecked")
    private <T> List<T> convert(T[] nums, Method method) throws InvocationTargetException, IllegalAccessException {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            list.add((T) method.invoke(null, nums[i]));

        return list;
    }

    public static int toBaseDecimal(String num) {
        return Integer.parseInt(num, 16);
    }

}
