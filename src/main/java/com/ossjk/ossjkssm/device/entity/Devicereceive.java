package com.ossjk.ossjkssm.device.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Devicereceive {
    private Integer id;

    private Integer did;

    private String code;

    private String recipients;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date receivedate;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date returndate;

    private int status;

    private String rcremarks;

    private String rtremarks;

    private Date crtm;

    private Date mdtm;
    
    private String sno;
    private String brand;
    private String bname;
    
    @Override
	public String toString() {
		return "Devicereceive [id=" + id + ", did=" + did + ", code=" + code + ", recipients=" + recipients
				+ ", receivedate=" + receivedate + ", returndate=" + returndate + ", status=" + status + ", rcremarks="
				+ rcremarks + ", rtremarks=" + rtremarks + ", crtm=" + crtm + ", mdtm=" + mdtm + ", sno=" + sno
				+ ", brand=" + brand + ", bname=" + bname + ", model=" + model + "]";
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

	private String model;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public Date getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String getRcremarks() {
        return rcremarks;
    }

    public void setRcremarks(String rcremarks) {
        this.rcremarks = rcremarks == null ? null : rcremarks.trim();
    }

    public String getRtremarks() {
        return rtremarks;
    }

    public void setRtremarks(String rtremarks) {
        this.rtremarks = rtremarks == null ? null : rtremarks.trim();
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