package com.ossjk.ossjkssm.device.mapper;

import java.util.List;

import com.ossjk.core.base.mapper.BaseMapper;
import com.ossjk.ossjkssm.device.entity.Devicesout;

public interface DevicesoutMapper extends BaseMapper<Devicesout>{
    int deleteByPrimaryKey(Integer id);

    int insert(Devicesout record);

    int insertSelective(Devicesout record);

    Devicesout selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Devicesout record);

    int updateByPrimaryKey(Devicesout record);
    
    List<Devicesout> selectAll();
    
    Devicesout selectByName(String name);
    int batchDelete(Integer[] ids);
    
    List<Devicesout> selectAllplus();
}