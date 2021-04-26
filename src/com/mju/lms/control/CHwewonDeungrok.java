package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DHwewon;
import com.mju.lms.valueObject.OHwewon;

public class CHwewonDeungrok {

    private DHwewon dHwewon;

    public CHwewonDeungrok() {
        this.dHwewon = new DHwewon();
    }

    public OHwewon readHwewon() {
        return null;
    }

    public void saveHwewon(OHwewon oHwewon) {
        this.dHwewon.save(oHwewon);
    }

}
