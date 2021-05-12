package com.mju.lms.model;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public abstract class MModel {

    public boolean read(Scanner sc) {
        Field[] fields = this.getClass().getDeclaredFields();
        if (sc.hasNext()) {
            Arrays.stream(fields).forEach(field -> {
                try {
                    field.setAccessible(true);
                    if (this.getClass().getSimpleName().equals("MHwewon"))
                        field.set(this, sc.nextLine());
                    else field.set(this, sc.next());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
            return true;
        }
        return false;
    }

    public void save(PrintWriter printWriter) {
        printWriter.println(this.toString());
    }

}
