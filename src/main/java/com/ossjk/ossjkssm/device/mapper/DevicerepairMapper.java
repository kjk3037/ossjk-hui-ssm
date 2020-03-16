package com.ossjk.ossjkssm.device.mapper;

import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.device.entity.Devicerepair;

public interface DevicerepairMapper extends BaseMapper<Devicerepair>{
    int deleteByPrimaryKey(Integer id);

    int insert(Devicerepair record);

    int insertSelective(Devicerepair record);

    Devicerepair selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Devicerepair record);

    int updateByPrimaryKey(Devicerepair record);
    
    List<Devicerepair> selectAll();
    
    //List<Devicerepair> selectAllplus();
    
    int batchDelete(Integer[] ids);

	//Devicerepair selectByName(String name);
}