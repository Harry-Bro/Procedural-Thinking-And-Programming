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

    public void saveSincheong(OHwewon oHwewon, OLecture oLecture) {
        this.dHwewon.save("./user/sincheong/" + oHwewon.getId() + ".txt", oLecture.toEntity());
    }

    public Vector<OLecture> readMiridamgi(OHwewon oHwewon) {
        return this.dHwewon.readAll("./user/miridamgi/" + oHwewon.getId() + ".txt");
    }

    public Vector<OLecture> readSinCheong(OHwewon oHwewon) {
        return this.dHwewon.readAll("./user/sincheong/" + oHwewon.getId() + ".txt");
    }

    public void removeMiridamgi(OHwewon oHwewon, OLecture oLecture) {
        Vector<OLecture> janbaguniList = readMiridamgi(oHwewon);
        janbaguniList.remove(oLecture);
        this.dHwewon.remove("./user/miridamgi/" + oHwewon.getId() + ".txt", janbaguniList);
    }

    public void removeSincheong(OHwewon oHwewon, OLecture oLecture) {
        Vector<OLecture> sinCheongList = readSinCheong(oHwewon);
        sinCheongList.remove(oLecture);
        this.dHwewon.remove("./user/sincheong/" + oHwewon.getId() + ".txt", sinCheongList);
    }
}
