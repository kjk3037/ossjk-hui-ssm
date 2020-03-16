package com.ossjk.ossjkssm.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.system.entity.Role;
import com.ossjk.ossjkssm.system.entity.User;
import com.ossjk.ossjkssm.system.service.RoleService;

@Controller
@RequestMapping("/system/role")
public class RoleController extends BaseController{
	
	@Autowired
	private RoleService roleService;
	
	
	
	@RequestMapping("/list")
	public String selectAll(Page page,ModelMap map){
		map.put("page", roleService.selectPage(page));
		return "system/role/list";
		
	}
	/**
	 * 去增加
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "system/role/edit";
	}
	/**
	 * 增加
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Role role) {
		System.out.println(role);
		if (roleService.insert(role) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id,ModelMap map) {
		//map.put("record",roleService.selectById(role.getId()));
		map.put("record",roleService.selectByPrimaryKey(id));
		return "/system/role/edit";
	}
	
	
	
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Role role) {
		System.out.println("修改ID为:"+role.getId()+"的字段");
		if (roleService.updateByPrimaryKey(role) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(Integer id) {
		//int i = 1 / 0;
		if (roleService.deleteByPrimaryKey(id) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	/**
	 * 批量删除
	 */
	@RequestMapping("/batchDelete")
	@ResponseBody
	public Object batchDelete(Integer[] ids) {
		
		if (roleService.batchDelete(ids) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	/*
	 * 测试接口
	 */
	@RequestMapping("/Check")
	@ResponseBody
	public Role check() {
		//Integer i=2;
		return roleService.selectByPrimaryKey(1);
	}
	
}
