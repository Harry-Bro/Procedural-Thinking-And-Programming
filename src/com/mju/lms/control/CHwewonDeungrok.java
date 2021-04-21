package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DHwewonDeungrok;
import com.mju.lms.valueObject.OHwewon;

public class CHwewonDeungrok {

    private DHwewonDeungrok dHwewonDeungrok;

    public CHwewonDeungrok() {
        this.dHwewonDeungrok = new DHwewonDeungrok();
    }

    public OHwewon readHwewon() {
        return this.dHwewonDeungrok.read();
    }

    public void saveHwewon(OHwewon oHwewon) {
        this.dHwewonDeungrok.save(oHwewon);
    }

}
