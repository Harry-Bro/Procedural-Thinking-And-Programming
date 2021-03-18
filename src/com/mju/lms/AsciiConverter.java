package com.mju.lms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AsciiConverter {
    private List<Integer> codes;
    private boolean isInteger = false;
    private boolean isFloat = false;
    private boolean isString = false;
    private int enterKey;

    public void start() throws IOException {
        osCheck();
        setCodes();
        verifyType();
        printAscii();
    }

    private void osCheck() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            this.enterKey = 12;
        } else if (os.contains("mac")) {
            this.enterKey = 10;
        }
    }

    public void setCodes() throws IOException {
        this.codes = new ArrayList<>();
        int read = 0;

        System.out.println("정수, 실수, 문자 중 하나의 Type으로만 입력해주세요.");
        System.out.print("input: ");
        while (!(read == this.enterKey)) {
            read = System.in.read();
            if (read != this.enterKey)
                codes.add(read);
        }
    }

    private void verifyType() {
        int dots = 0;
        for (Integer code : codes) {
            if (code > 127 || code < 0)
                throw new IllegalArgumentException("Ascii Code 범위 내에서 작성해주세요.");

            if (code > 47 && code < 58) isInteger = true;

            if (code == 46) {
                isFloat = true;
                dots++;
                if (dots > 1)
                    throw new IllegalArgumentException("소수점은 하나만 작성해주세요.");
            }

            if (!(code > 47 && code < 58) && !isFloat)
                isString = true;

        }

        if (isInteger && isString || isFloat && isString)
            throw new IllegalArgumentException("정수(또는 실수)와 문자(열)은 함께 작성하실 수 없습니다.");
    }

    private void printAscii() {
        if (isString) {
            StringBuilder result = new StringBuilder();
            for (Integer code : codes)
                result.append((char) code.intValue());

            System.out.printf("Result - 문자(열): %s", result);
        } else if (isFloat) {
            double result = 0;
            int place = 0;
            int multiplier = 1;
            for (int i = codes.size() - 1; i >= 0; i--) {
                if (codes.get(i) != 46) {
                    result += (codes.get(i) - 48) * multiplier;
                    multiplier *= 10;
                } else {
                    place = i;
                }
            }

            for (int i = 0; i < place; i++)
                result *= 0.1;

            System.out.printf("Result - 실수: %s", result);
        } else {
            int result = 0;
            int multiplier = 1;
            for (int i = codes.size() - 1; i >= 0; i--) {
                result += (codes.get(i) - 48) * multiplier;
                multiplier *= 10;
            }

            System.out.printf("Result - 정수: %s", result);
        }
    }

}
