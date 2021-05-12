package com.mju.lms.dataAccessObject;

import com.mju.lms.model.MIndex;
import com.mju.lms.valueObject.OIndex;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class DIndex {

    public DIndex() {
    }

    public Vector<OIndex> readAll(String fileName) {
        File file = new File("./data/" + fileName);
        Vector<OIndex> indices = new Vector<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), "euc-kr"));
            Scanner sc = new Scanner(bufferedReader);
            MIndex mIndex = new MIndex();
            while (mIndex.read(sc)) {
                OIndex oIndex = new OIndex();
                oIndex.set(mIndex);
                indices.add(oIndex);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return indices;
    }

}
