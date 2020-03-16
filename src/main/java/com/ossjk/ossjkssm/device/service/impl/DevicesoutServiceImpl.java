package com.ossjk.ossjkssm.device.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.device.entity.Devicesout;
import com.ossjk.ossjkssm.device.mapper.DevicesoutMapper;
import com.ossjk.ossjkssm.device.service.DevicesoutService;

@Service
public class DevicesoutServiceImpl extends BaseServiceImpl<DevicesoutMapper, Devicesout> implements DevicesoutService{

	@Override
	public Devicesout selectByName(String name) {
		return baseMapper.selectByName(name);
	}

	@Override
	public List<Devicesout> selectAll() {
		return baseMapper.selectAllplus();
	}

	@Override
	public Page<Devicesout> selectPage(Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		page.toPage(new PageInfo(baseMapper.selectAllplus()));
		return page;
	}

	@Override
	public int batchDelete(Integer[] ids) {
		return baseMapper.batchDelete(ids);
	}

	/*@Override
	public List<Devicesout> selectAllplus() {
		// TODO Auto-generated method stub
		return baseMapper.selectAllplus();
	}*/

	/*@Override
	public Devicesout selectCode() {
		// TODO Auto-generated method stub
		return baseMapper.selectCode();
	}
	@Override
	public List<Devicesout> selectReceive() {
		return baseMapper.selectReceive();
	}
	@Override
	public Devicesout selectCodeById(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.selectCodeById(id);
	}*/
}
