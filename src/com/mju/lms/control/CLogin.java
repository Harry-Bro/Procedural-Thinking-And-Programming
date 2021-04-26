package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLogin;

public class CLogin {

    private DHwewon dHwewon;

    public CLogin() {
        this.dHwewon = new DHwewon();
    }

    public OHwewon login(OLogin oLogin) {
        return dHwewon.login(oLogin);
    }
}
