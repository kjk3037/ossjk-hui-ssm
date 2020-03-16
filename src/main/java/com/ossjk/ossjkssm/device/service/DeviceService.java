package com.ossjk.ossjkssm.device.service;

import java.util.List;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.device.entity.Device;
import com.ossjk.ossjkssm.device.entity.Devicesout;



public interface DeviceService extends BaseService<Device>{

	Device selectByName(String name);

	List<Device> selectAll();

	Page<Device> selectPage(Page page);

	int batchDelete(Integer[] ids);
	List<Device> selectAllplus();
	Device selectCode();
	List<Device> selectReceive();

	Device selectCodeById(Integer id);
}
