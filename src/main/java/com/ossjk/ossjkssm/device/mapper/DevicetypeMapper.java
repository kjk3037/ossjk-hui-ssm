package com.ossjk.ossjkssm.device.mapper;

import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.device.entity.Devicetype;


public interface DevicetypeMapper extends BaseMapper<Devicetype>{
   
    int batchDelete(Integer[] ids);
    int insert(Devicetype record);

    int insertSelective(Devicetype record);

    Devicetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Devicetype record);

    int updateByPrimaryKey(Devicetype record);
    
    List<Devicetype> selectAll();
    //List<Devicetype> selectAllplus();
    Devicetype selectByName(String name);
}