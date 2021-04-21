package com.mju.lms.dataAccessObject;

import com.mju.lms.model.MHwewon;
import com.mju.lms.valueObject.OHwewon;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DHwewonDeungrok {

    private File file;

    public DHwewonDeungrok() {
        this.file = new File("./hwewon.txt");
    }

    public void save(OHwewon oHwewon) {
        // oHwewon에서 mHwewon으로 데이터를 이동
        MHwewon mHwewon = oHwewon.toEntity();
        // MHwewon을 통해서 파일에 저장.
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(this.file, true))) {
            printWriter.println(mHwewon.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("회원 등록 완료.");
    }

    public OHwewon read() {
        // MHwewon을 통해 data read
        // oHwewon 생성
        // mHwewon에서 oHwewon으로 데이터 이동.

        // oHwewon 리턴.
        return null;
    }
}
