package com.mju.lms.dataAccessObject;

import com.mju.lms.model.MLecture;
import com.mju.lms.valueObject.OLecture;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class DLecture {

    public Vector<OLecture> readAll(String fileName) {
        File file = new File("./data/" + fileName);
        Vector<OLecture> indices = new Vector<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), "euc-kr"));
            Scanner sc = new Scanner(bufferedReader);
            MLecture mLecture = new MLecture();
            while (mLecture.read(sc)) {
                OLecture oLecture = new OLecture();
                oLecture.set(mLecture);
                indices.add(oLecture);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return indices;
    }

}
