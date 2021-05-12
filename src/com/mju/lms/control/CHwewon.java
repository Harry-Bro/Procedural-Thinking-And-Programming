package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLecture;

import java.util.Vector;

public class CHwewon {

    private DHwewon dHwewon;

    public CHwewon() {
        this.dHwewon = new DHwewon();
    }

    public OHwewon readHwewon() {
        return null;
    }

    public void saveHwewon(OHwewon oHwewon) {
        this.dHwewon.save("./hwewon.txt", oHwewon.toEntity());
    }

    public void saveMiridamgi(OHwewon oHwewon, OLecture oLecture) {
        this.dHwewon.save("./user/miridamgi/" + oHwewon.getId() + ".txt", oLecture.toEntity());
    }

    public Vector<OLecture> readJanbaguni(OHwewon oHwewon) {
        return this.dHwewon.readAll("./user/miridamgi/" + oHwewon.getId() + ".txt");
    }

}
