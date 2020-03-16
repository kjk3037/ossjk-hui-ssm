package com.ossjk.ossjkssm.device.mapper;

import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.device.entity.Devicereceive;

public interface DevicereceiveMapper extends BaseMapper<Devicereceive>{
    int deleteByPrimaryKey(Integer id);

    int insert(Devicereceive record);

    int insertSelective(Devicereceive record);

    Devicereceive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Devicereceive record);

    int updateByPrimaryKey(Devicereceive record);

	List<Devicereceive> selectAll();

	int batchDelete(Integer[] ids);
	List<Devicereceive> selectAllplus();


}