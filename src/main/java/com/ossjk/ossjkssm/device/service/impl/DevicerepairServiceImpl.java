package com.ossjk.ossjkssm.device.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.device.entity.Devicerepair;
import com.ossjk.ossjkssm.device.mapper.DevicerepairMapper;
import com.ossjk.ossjkssm.device.service.DevicerepairService;

@Service
public class DevicerepairServiceImpl extends BaseServiceImpl<DevicerepairMapper, Devicerepair> implements DevicerepairService{

	@Override
	public Devicerepair selectByName(String name) {
		return null;
	}

	@Override
	public List<Devicerepair> selectAll() {
		return baseMapper.selectAll();
	}

	@Override
	public Page<Devicerepair> selectPage(Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		page.toPage(new PageInfo(baseMapper.selectAll()));
		return page;
	}

	@Override
	public int batchDelete(Integer[] ids) {
		return baseMapper.batchDelete(ids);
	}
	public int insert(Devicerepair device) {
		return baseMapper.insert(device);
	}
	/*@Override
	public List<Devicerepair> selectAllplus() {
		// TODO Auto-generated method stub
		return baseMapper.selectAllplus();
	}*/

	/*@Override
	public Devicerepair selectCode() {
		// TODO Auto-generated method stub
		return baseMapper.selectCode();
	}
	@Override
	public List<Devicerepair> selectReceive() {
		return baseMapper.selectReceive();
	}
	@Override
	public Devicerepair selectCodeById(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.selectCodeById(id);
	}*/
}
