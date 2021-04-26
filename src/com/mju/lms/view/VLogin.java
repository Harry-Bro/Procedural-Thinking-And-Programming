package com.mju.lms.view;

import com.mju.lms.control.CLogin;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLogin;
import java.util.Scanner;

public class VLogin {

    private CLogin cLogin;
    private Scanner sc;

    public VLogin() {
        cLogin = new CLogin();
        sc = new Scanner(System.in);
    }

    public OHwewon show() {
        System.out.print("학번을 입력하세요: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.nextLine();
        OLogin oLogin = new OLogin(id, password);

        return cLogin.login(oLogin);
    }

}
