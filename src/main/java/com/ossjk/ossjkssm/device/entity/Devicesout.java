package com.ossjk.ossjkssm.device.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.ossjk.core.base.entity.BaseEntity;

public class Devicesout extends BaseEntity{

    private Integer did;
    private String uname;
    
    private Integer outter;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date outdate;

    private String remarks;

    private Short status;

    private Integer approver;

    private String approvalremarks;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date approvaldate;
    
    private String sno;
    
    private String brand;
    
    private String bname;
    
    private String model;
    
    private String code;
    
    
    
    public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Devicesout [did=" + did + ", uname=" + uname + ", outter=" + outter + ", outdate=" + outdate
				+ ", remarks=" + remarks + ", status=" + status + ", approver=" + approver + ", approvalremarks="
				+ approvalremarks + ", approvaldate=" + approvaldate + ", sno=" + sno + ", brand=" + brand + ", bname="
				+ bname + ", model=" + model + ", code=" + code + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getOutter() {
        return outter;
    }

    public void setOutter(Integer outter) {
        this.outter = outter;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getApprover() {
        return approver;
    }

    public void setApprover(Integer approver) {
        this.approver = approver;
    }

    public String getApprovalremarks() {
        return approvalremarks;
    }

    public void setApprovalremarks(String approvalremarks) {
        this.approvalremarks = approvalremarks == null ? null : approvalremarks.trim();
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
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