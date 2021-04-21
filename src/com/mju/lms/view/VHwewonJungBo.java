package com.mju.lms.view;

import com.mju.lms.control.CHwewonDeungrok;

public class VHwewonJungBo {

    private CHwewonDeungrok cHwewonDeungrok;

    public VHwewonJungBo() {
        this.cHwewonDeungrok = new CHwewonDeungrok();
    }

    public void show() {
        this.cHwewonDeungrok.readHwewon();
    }

}
