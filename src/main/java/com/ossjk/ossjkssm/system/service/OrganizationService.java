package com.ossjk.ossjkssm.system.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.system.entity.Organization;

public interface OrganizationService extends BaseService<Organization> {

	Organization selectByName(String name);

	List<Organization> selectAll();
	Page<Organization> selectAll(Page page);

	int batchDelete(Integer[] ids);

}
