package com.ossjk.ossjkssm.device.service;

import java.util.List;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.device.entity.Devicerepair;
import com.ossjk.ossjkssm.device.entity.Devicerepair;



public interface DevicerepairService extends BaseService<Devicerepair>{

	Devicerepair selectByName(String name);

	List<Devicerepair> selectAll();

	Page<Devicerepair> selectPage(Page page);

	int batchDelete(Integer[] ids);
	
	
	/*List<Device> selectAllplus();
	Device selectCode();
	List<Device> selectReceive();

	Device selectCodeById(Integer id);*/
}
