package com.mju.lms.valueObject;

import com.mju.lms.model.MIndex;
import com.mju.lms.model.MModel;

public class OIndex extends OModel {

    private String id;
    private String name;
    private String fileName;

    public OIndex() {
    }

    @Override
    public MModel toEntity() {
        return new MIndex(id, name, fileName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
