package com.mju.lms.control;

import com.mju.lms.dataAccessObject.DIndex;
import com.mju.lms.valueObject.OIndex;

import java.util.Vector;

public class CIndex {

    private DIndex dIndex;

    public CIndex() {
        this.dIndex = new DIndex();
    }

    public Vector<OIndex> getAll(String fileName) {
        return this.dIndex.readAll(fileName);
    }

}
