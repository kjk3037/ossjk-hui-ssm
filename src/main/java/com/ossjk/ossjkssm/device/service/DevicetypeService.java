package com.ossjk.ossjkssm.device.service;

import java.util.List;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.device.entity.Device;
import com.ossjk.ossjkssm.device.entity.Devicetype;

public interface DevicetypeService extends BaseService<Devicetype>{
	Devicetype selectByName(String name);

	Page<Devicetype> selectPage(Page page);

	int batchDelete(Integer[] ids);
	List<Devicetype> selectAllplus();

	List<Devicetype> selectAll();
}
