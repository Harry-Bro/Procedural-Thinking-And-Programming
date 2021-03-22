package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        int[] inputArray = new int[10];
        int index = 0;
        int code = System.in.read();

        while (code >= '0' && code <= '9') {
            inputArray[index] = code;
            index++;
            code = System.in.read();
        }

        int result = 0;
        int multiplier = 1;
        for (int i = index - 1; i >= 0; i--) {
            result += (inputArray[i] - '0') * multiplier;
            multiplier *= 10;
        }
        System.out.println(result);

        // 정수 Type 을 데이터를 Char 로 변환
        int quotient = result; // 현재 result 값(사용자가 입력하여 정수형으로 바꾼 값)을 quotient(몫)에 저장
        int[] remainders = new int[10]; // Composite Data Type에 데이터를 담기 위한 remainders라는 변수 주소를 바인딩
        // 메모리 공간을 확보하고 주소를 저장하는 공간(10)만큼을 할당한다.
        // new operation을 통해 시작 주소를 반환한다.
        index = 0; // index를 0으로 초기화 한다.
        while (quotient > 0) { // Flow of Contorl인 while문을 통해 몫이 0보다 클 동안 반복한다.
            remainders[index] = quotient % 10; // 현재 저장되어있는 quotient 값을 10으로 나눈 나머지 값을
            // remainders[0] 에 처음 저장한다. 만약 432가 quotient에 있었다면 2가 들어가고, 3, 4 순으로 들어간다.
            quotient /= 10; // 몫을 10으로 나눈 값을 quotient 변수에 할당한다.
            index++; // index를 1 증가시켜준다.
        }

        char[] charOutput = new char[10]; // charOutput 변수의 주소를 바인딩하고 new Operation을 통해 10의 공간만큼 할당한다.
        for (int i = index - 1; i >= 0; i--) { // Flow of control 중 하나인 for문을 통해 index - 1 부터 시작하여
            // i 가 0보다 크거나 같을 때까지 i를 1씩 감소시키며 반복한다.
            charOutput[i] = (char) (remainders[i] + '0'); // remainders[0]번지에 있는 값을 48만큼 더해주고
            // char로 형변환을 해주어 charOutput[0]에 값을 저장한다. 위에서 2, 3, 4 순으로 저장되어 있었다면
            // 4 + 48 = 52를 char 타입으로 형변환 하는 것이다.
            // 그다음 3 + 48 = 51, 2 + 48 = 50 이런식으로 계속해서 거꾸로 형변환을 해간다.
            System.out.printf("%s", charOutput[i]); // 형변환한 값을 printf 메서드를 통해 순서대로 나타나게 한다.
        }
    }
}
