package com.ossjk.ossjkssm.device.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;

import com.ossjk.ossjkssm.device.entity.Devicetype;
import com.ossjk.ossjkssm.device.mapper.DevicetypeMapper;
import com.ossjk.ossjkssm.device.service.DevicetypeService;

@Service
public class DevicetypeServiceImpl extends BaseServiceImpl<BaseMapper<Devicetype>, Devicetype> implements DevicetypeService{
	@Autowired
	DevicetypeMapper devicetypeMapper;
		
	@Override
	public Devicetype selectByName(String name) {
		return devicetypeMapper.selectByName(name);
	}

	@Override
	public List<Devicetype> selectAll() {
		return devicetypeMapper.selectAll();
	}

	@Override
	public Page<Devicetype> selectPage(Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		page.toPage(new PageInfo(devicetypeMapper.selectAll()));
		return page;
	}

	@Override
	public int batchDelete(Integer[] ids) {
		return devicetypeMapper.batchDelete(ids);
	}

	@Override
	public List<Devicetype> selectAllplus() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Devicetype> selectAllplus() {
		// TODO Auto-generated method stub
		return devicetypeMapper.selectAllplus();
	}*/


}
