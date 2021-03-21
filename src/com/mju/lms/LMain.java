package com.mju.lms;

import java.io.IOException;

public class LMain {

    public static void main(String[] args) throws IOException {
        int[] inputArray = new int[10]; // int 데이터 타입의 배열을 주소할당과 동시에 초기화 시켰다.
        // 배열을 생성할 시에는 size를 명시해주어야 하는데 위 코드의 경우에는 10개의 방을 생성한 것이다.
        // 방은 데이터 하나의 값이 들어갈 수 있는 공간을 의미한다.

        int index = 0; // 이름 정의, 메모리 공간, 할당(Binding)이 한번에 했다.
        int code = System.in.read(); // System.in.read 메서드를 사용하면 하나의 1byte를 입력받아서 처리할 수 있다.
        // 위 메서드의로 입력된 값은 ASCII 코드에 문자에 해당하는 값으로 저장된다.

        // while 반복문으로 조건이 false가 될 때까지 계속해서 루프를 돌린다.
        // 아래의 경우에는 char 형태로 비교했는데, '0'은 48로 변환되어 true false를 검사하게 된다.
        while (code >= '0' && code <= '9') {
            inputArray[index] = code; // 상단에 생성한 배열에 인덱스 값에 맞는 방(공간)에 위에서 읽은(System.in.read) 값을 넣는다.
            // 초기 index는 0이며
            index++; // 루프를 한번 돌 때마다 index 값이 1씩 증가한다.
            code = System.in.read(); // 다시 키보드를 읽어 code 변수에 값을 할당한다.
        }

        int result = 0; // result 라는 이름의 변수에 0을 할당한다.
        int multiplier = 1; // 자리수에따른 값을 더해주기 위해 초기에는 1을 저장한다.
        for (int i = index - 1; i >= 0; i--) { // index의 -1 부터 시작하여 i가 0보다 작거나 같을 때까지 i를 계속 1씩 감소시키며 반복한다.
            result += (inputArray[i] - '0') * multiplier; // inputArray배열에 저장한 값을 해당 인덱스 값에서 48을 빼준후 자리수를 곱해준다.
            // 예를 들어 123을 입력했으면 3부터 값을 계산하며 3은 51에 해당하고 48을 빼주고 3에다가 자리수인 1을 곱해서 1이다. 이 값은 result에 더한다.
            // 다음 2는 50으로 50-48 = 2에 multiplier *= 10;에 의하여 증가한 multiplier(값: 10)을 곱해준다.
            // 그러면 20이 되는데 20을 result에 더해준다. 그렴 값은 23이 된다.
            // 마지막으로 1은 49로 49-48을 하여 1이 나오고 multiplier의 값인 100을 곱해주면 100이 나온다.
            // 이 값을 result(23) 에 더해주면 result에는 123의 값이 최종적으로 들어가게 된다.
            multiplier *= 10; // 자리수를 표현해주는 역할을 한다.
        }
        System.out.println(result); // result의 값을 console에 보여준다.
//        char c = (char) System.in.read(); // '1' => 49를 저장하지만 println할 때 문자로 표현해준다.
//        int i = System.in.read(); // '1' => 49 숫자 그대로 49를 저장하고 print할때도 49 그대로 보여준다.
    }

}
