package com.ossjk.ossjkssm.system.entity;

import java.util.Date;

import com.ossjk.core.base.entity.BaseEntity;

public class Organization extends BaseEntity{

    private String name;

    private String remarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }


}