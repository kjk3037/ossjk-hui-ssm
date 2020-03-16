package com.ossjk.ossjkssm.device.service;

import java.util.List;

import com.ossjk.core.base.service.BaseService;
import com.ossjk.core.vo.Page;

import com.ossjk.ossjkssm.device.entity.Devicereceive;



public interface DevicereceiveService extends BaseService<Devicereceive>{


	List<Devicereceive> selectAll();

	Page<Devicereceive> selectPage(Page page);

	int batchDelete(Integer[] ids);
	//List<Devicereceive> selectAllplus();

}
