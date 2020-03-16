package com.ossjk.ossjkssm.system.entity;

import com.ossjk.core.base.entity.BaseEntity;

public class Role extends BaseEntity{
	private String name;
	private String remarks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", remarks=" + remarks + "]";
	}
	
}
