package com.mju.lms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment {

    public static void main(String[] args) throws IOException {

        List<Integer> codes = new ArrayList<>();

        while (!(codes.size() > 0 && codes.get(codes.size()-1) == 10))
            codes.add(System.in.read());

        for (int i=0; i < codes.size() -1; i++)
            System.out.print(codes.get(i) - 48);

    }

}
