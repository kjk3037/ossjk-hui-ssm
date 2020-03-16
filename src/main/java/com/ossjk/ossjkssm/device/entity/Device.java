package com.ossjk.ossjkssm.device.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ossjk.core.base.entity.BaseEntity;


public class Device extends BaseEntity{

    private Integer ogid;

    private Integer dtid;

    private String code;

    private BigDecimal residual;

    private BigDecimal original;

    private Short status;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date proddate;

    private Integer creator;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date createtime;

    private Integer buyer;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date bugdate;

    private String sno;

    private String bname;
    private String oname;
    private String cname;
    private String brand;
    private String dname;
    private String model;
    private String dtname;
    
    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDtname() {
		return dtname;
	}

	public void setDtname(String dtname) {
		this.dtname = dtname;
	}

	@Override
	public String toString() {
		return "Device [ogid=" + ogid + ", dtid=" + dtid + ", code=" + code + ", residual=" + residual + ", original="
				+ original + ", status=" + status + ", proddate=" + proddate + ", creator=" + creator + ", createtime="
				+ createtime + ", buyer=" + buyer + ", bugdate=" + bugdate + ", sno=" + sno + ", bname=" + bname
				+ ", oname=" + oname + ", cname=" + cname + ", brand=" + brand + ", dname=" + dname + "]";
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOgid() {
        return ogid;
    }

    public void setOgid(Integer ogid) {
        this.ogid = ogid;
    }

    public Integer getDtid() {
        return dtid;
    }

    public void setDtid(Integer dtid) {
        this.dtid = dtid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public BigDecimal getResidual() {
        return residual;
    }

    public void setResidual(BigDecimal residual) {
        this.residual = residual;
    }

    public BigDecimal getOriginal() {
        return original;
    }

    public void setOriginal(BigDecimal original) {
        this.original = original;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getProddate() {
        return proddate;
    }

    public void setProddate(Date proddate) {
        this.proddate = proddate;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getBuyer() {
        return buyer;
    }

    public void setBuyer(Integer buyer) {
        this.buyer = buyer;
    }

    public Date getBugdate() {
        return bugdate;
    }

    public void setBugdate(Date bugdate) {
        this.bugdate = bugdate;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
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