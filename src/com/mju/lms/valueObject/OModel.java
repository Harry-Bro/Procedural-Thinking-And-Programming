package com.mju.lms.valueObject;

import com.mju.lms.model.MModel;

import java.lang.reflect.Field;

public abstract class OModel {
    public void set(MModel model) {
        Field[] oModelFields = this.getClass().getDeclaredFields();
        Field[] mModelFields = model.getClass().getDeclaredFields();
        try {
            int index = 0;
            for (Field field : oModelFields) {
                field.setAccessible(true);
                mModelFields[index].setAccessible(true);
                field.set(this, mModelFields[index].get(model));
                index++;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public abstract MModel toEntity();
}
