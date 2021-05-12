package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DLecture;
import com.mju.lms.valueObject.OLecture;

import java.util.Vector;

public class CLecture {

    private DLecture dLecture;

    public CLecture() {
        this.dLecture = new DLecture();
    }

    public Vector<OLecture> getAll(String filename) {
        return this.dLecture.readAll(filename);
    }
}
