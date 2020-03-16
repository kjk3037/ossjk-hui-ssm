package com.ossjk.ossjkssm.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.impl.BaseServiceImpl;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Role;
import com.ossjk.ossjkssm.system.mapper.RoleMapper;
import com.ossjk.ossjkssm.system.service.RoleService;

@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements RoleService {
	//@Autowired
	//RoleMapper roleMapper;

	/*@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return baseMapper.selectAll();
	}
*/
	@Override
	public Page<Role> selectPage(Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		page.toPage(new PageInfo(baseMapper.selectAll()));
		return page;
	}
	/*public int insert(Role role) {
		return roleMapper.insert(role);
	}

	@Override
	public int update(Role role) {
		return roleMapper.updateByPrimaryKey(role);
	}*/
	/*public Role selectById(Integer id){
		System.out.println(id);
		return roleMapper.selectById(id);
	}*/

	@Override
	public int batchDelete(Integer[] ids) {
		return baseMapper.batchDelete(ids);
	}
	
	public List<Role> selectAll(){
		return baseMapper.selectAll();
		
	}
}
