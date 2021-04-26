package com.mju.lms.dataAccessObject;

import com.mju.lms.model.MHwewon;
import com.mju.lms.valueObject.OHwewon;
import com.mju.lms.valueObject.OLogin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DHwewon {

    private File file;
    private List<MHwewon> mHwewons;

    public DHwewon() {
        this.file = new File("./hwewon.txt");
        this.mHwewons = new ArrayList<>();
    }

    public void save(OHwewon oHwewon) {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(this.file, true))) {
            MHwewon mHwewon = oHwewon.toEntity();
            mHwewon.save(printWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("회원 등록 완료.");
    }

    public OHwewon login(OLogin oLogin) {
        try {
            System.out.println("로그인 중...");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                int id = Integer.parseInt(sc.nextLine());
                String password = sc.nextLine();
                String name = sc.nextLine();
                String address = sc.nextLine();
                int hwakgwa = Integer.parseInt(sc.nextLine());
                this.mHwewons.add(new MHwewon(id, password, name, address, hwakgwa));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<MHwewon> mHwewonList = this.mHwewons.stream()
            .filter(mHwewon -> oLogin.getId() == mHwewon.getId()
                && oLogin.getPassword().equals(mHwewon.getPassword())).collect(Collectors.toList());
        OHwewon oHwewon = new OHwewon();
        if (mHwewonList.size() > 0) {
            MHwewon mHwewon = mHwewonList.get(0);
            oHwewon.setId(mHwewon.getId());
            oHwewon.setName(mHwewon.getName());
            oHwewon.setAddress(mHwewon.getAddress());
            oHwewon.setHwakgwa(mHwewon.getHwakgwa());
            return oHwewon;
        }

        return null;
    }

}
