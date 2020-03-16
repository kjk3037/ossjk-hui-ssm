package com.ossjk.ossjkssm.device.mapper;

import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.device.entity.Device;
import com.ossjk.ossjkssm.system.entity.User;


public interface DeviceMapper extends BaseMapper<Device>{

	int deleteByPrimaryKey(Integer id);

	int insert(Device record);

	int insertSelective(Device record);

	Device selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Device record);

	int updateByPrimaryKey(Device record);

	Device selectByName(String name);

	List<Device> selectAll();

	int batchDelete(Integer[] ids);
	
	List<Device> selectAllplus();
	
	Device selectCode();
	Device selectCodeById(Integer id);
	List<Device> selectReceive();
}