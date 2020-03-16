package com.ossjk.ossjkssm.device.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ossjk.core.base.entity.BaseEntity;

public class Devicerepair extends BaseEntity{

    private Integer did;

    private Integer damager;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date damagedate;

    private String damageremarks;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date repairdate;

    private Integer repairer;

    private String repairremarks;

    private Integer status;

    private String sno;
    
    private String bname;
    
    private String brand;
    
    private String model;
    

    public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDamager() {
        return damager;
    }

    public void setDamager(Integer damager) {
        this.damager = damager;
    }

    public Date getDamagedate() {
        return damagedate;
    }

    public void setDamagedate(Date damagedate) {
        this.damagedate = damagedate;
    }

    public String getDamageremarks() {
        return damageremarks;
    }

    public void setDamageremarks(String damageremarks) {
        this.damageremarks = damageremarks == null ? null : damageremarks.trim();
    }

    public Date getRepairdate() {
        return repairdate;
    }

    public void setRepairdate(Date repairdate) {
        this.repairdate = repairdate;
    }

    public Integer getRepairer() {
        return repairer;
    }

    public void setRepairer(Integer repairer) {
        this.repairer = repairer;
    }

    public String getRepairremarks() {
        return repairremarks;
    }

    public void setRepairremarks(String repairremarks) {
        this.repairremarks = repairremarks == null ? null : repairremarks.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

 
}