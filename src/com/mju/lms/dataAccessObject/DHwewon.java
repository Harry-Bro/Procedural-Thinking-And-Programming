package com.mju.lms.dataAccessObject;

import com.mju.lms.model.MHwewon;
import com.mju.lms.model.MLecture;
import com.mju.lms.model.MModel;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLecture;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Vector;

public class DHwewon {

    public DHwewon() {
    }

    public void save(String pathName, MModel oModel) {
        File file = new File(pathName);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            oModel.save(printWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("저장 완료");
    }

    public void remove(String pathName, Vector<OLecture> oModels) {
        File file = new File(pathName);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8))) {
            for (OLecture oLecture : oModels) {
                oLecture.toEntity().save(printWriter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public OHwewon read(String id) {
        File file = new File("./hwewon.txt");
        try {
            Scanner sc = new Scanner(file);
            MHwewon mHwewon = new MHwewon();
            while (mHwewon.read(sc)) {
                if (mHwewon.getId().equals(id)) {
                    OHwewon oHwewon = new OHwewon();
                    oHwewon.set(mHwewon);
                    return oHwewon;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Vector<OLecture> readAll(String pathName) {
        File file = new File(pathName);
        Vector<OLecture> indices = new Vector<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            Scanner sc = new Scanner(bufferedReader);
            MLecture mLecture = new MLecture();
            while (mLecture.read(sc)) {
                OLecture oLecture = new OLecture();
                oLecture.set(mLecture);
                indices.add(oLecture);
            }
        } catch (IOException e) {
//            e.printStackTrace();
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
                printWriter.print("");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        return indices;
    }

}
