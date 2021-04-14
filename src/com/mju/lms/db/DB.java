package com.mju.lms.db;

import com.mju.lms.model.LHwewon;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static DB db = null;

    private final List<LHwewon> lHwewons;

    private DB() {
        lHwewons = new ArrayList<>();
    }

    public static DB getInstance() {
        if (db == null) db = new DB();
        return db;
    }

    public List<LHwewon> getlHwewons() {
        return lHwewons;
    }
}
