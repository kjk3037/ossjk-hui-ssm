package com.ossjk.ossjkssm.system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Organization;
import com.ossjk.ossjkssm.system.entity.Role;
import com.ossjk.ossjkssm.system.entity.User;
import com.ossjk.ossjkssm.system.mapper.OrganizationMapper;
import com.ossjk.ossjkssm.system.service.OrganizationService;
import com.ossjk.ossjkssm.system.service.RoleService;

@Service
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationMapper, Organization> implements OrganizationService {
	@Override
	public Organization selectByName(String name) {
		return baseMapper.selectByName(name);
	}


	@Override
	public Page<Organization> selectAll(Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		page.toPage(new PageInfo(baseMapper.selectAll()));
		return page;
	}

	@Override
	public int batchDelete(Integer[] ids) {
		return baseMapper.batchDelete(ids);
	}


	@Override
	public List<Organization> selectAll() {
		// TODO Auto-generated method stub
		return baseMapper.selectAll();
	}

	
}
