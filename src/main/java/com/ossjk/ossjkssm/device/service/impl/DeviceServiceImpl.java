package com.ossjk.ossjkssm.device.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.device.entity.Device;
import com.ossjk.ossjkssm.device.mapper.DeviceMapper;
import com.ossjk.ossjkssm.device.service.DeviceService;

@Service
public class DeviceServiceImpl extends BaseServiceImpl<DeviceMapper, Device> implements DeviceService{

	@Override
	public Device selectByName(String name) {
		return baseMapper.selectByName(name);
	}

	@Override
	public List<Device> selectAll() {
		return baseMapper.selectAll();
	}

	@Override
	public Page<Device> selectPage(Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		page.toPage(new PageInfo(baseMapper.selectAllplus()));
		return page;
	}

	@Override
	public int batchDelete(Integer[] ids) {
		return baseMapper.batchDelete(ids);
	}

	@Override
	public List<Device> selectAllplus() {
		// TODO Auto-generated method stub
		return baseMapper.selectAllplus();
	}

	@Override
	public Device selectCode() {
		// TODO Auto-generated method stub
		return baseMapper.selectCode();
	}
	@Override
	public List<Device> selectReceive() {
		return baseMapper.selectReceive();
	}
	@Override
	public Device selectCodeById(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.selectCodeById(id);
	}
}
