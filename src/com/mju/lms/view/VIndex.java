package com.mju.lms.view;

import com.mju.lms.control.CIndex;
import com.mju.lms.valueObject.OIndex;

import java.util.Scanner;
import java.util.Vector;

public abstract class VIndex {

    private Scanner sc;
    private CIndex cIndex;

    public VIndex(Scanner sc) {
        this.sc = sc;
        this.cIndex = new CIndex();
    }

    public String show(String fileName) {
        Vector<OIndex> indices = cIndex.getAll(fileName);
        indices.forEach(index -> System.out.println(index.getId() + " " + index.getName()));
        String id = this.sc.next();
        return indices.stream().filter(index -> index.getId().equals(id))
                .map(OIndex::getFileName)
                .findFirst()
                .orElseGet(() -> "");
    }

}
