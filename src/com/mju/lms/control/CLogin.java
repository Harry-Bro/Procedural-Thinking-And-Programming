package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLogin;

public class CLogin {

    private DHwewon dHwewon;

    public CLogin() {
        this.dHwewon = new DHwewon();
    }

    public OHwewon validate(OLogin oLogin) {
        OHwewon oHwewon = this.dHwewon.read(oLogin.getId());
        if (oHwewon != null) {
            if (oLogin.getPassword().equals(oHwewon.getPassword())) {
                return oHwewon;
            }
        }
        return null;
    }

}
