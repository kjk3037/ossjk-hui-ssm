package com.ossjk.ossjkssm.device.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.ossjk.core.base.entity.BaseEntity;

public class Devicetype extends BaseEntity{
   

	private Integer id;

    private String name;

    private String brand;

    private String intlcode;

    private String model;

    private String remarks;

    private Short asl;

    private BigDecimal anrv;

    private Date crtm;

    private Date mdtm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getIntlcode() {
        return intlcode;
    }

    public void setIntlcode(String intlcode) {
        this.intlcode = intlcode == null ? null : intlcode.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getAsl() {
        return asl;
    }

    public void setAsl(Short asl) {
        this.asl = asl;
    }

    public BigDecimal getAnrv() {
        return anrv;
    }

    public void setAnrv(BigDecimal anrv) {
        this.anrv = anrv;
    }

    public Date getCrtm() {
        return crtm;
    }

    public void setCrtm(Date crtm) {
        this.crtm = crtm;
    }

    public Date getMdtm() {
        return mdtm;
    }

    public void setMdtm(Date mdtm) {
        this.mdtm = mdtm;
    }
}