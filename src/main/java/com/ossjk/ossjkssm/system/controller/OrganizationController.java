package com.ossjk.ossjkssm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.system.entity.Organization;
import com.ossjk.ossjkssm.system.entity.Role;
import com.ossjk.ossjkssm.system.service.OrganizationService;

@Controller
@RequestMapping("/system/organization")
public class OrganizationController extends BaseController{
	
	@Autowired
	private OrganizationService organizationService;

	@RequestMapping("/list")
	public String selectAll(Page page,ModelMap map){
		map.put("page", organizationService.selectAll(page));
		return "system/organization/list";
		
	}
	/**
	 * 去增加
	 */
	@RequestMapping("/toInsert")
	public String toInsert() {
		return "system/organization/edit";
	}
	/**
	 * 增加
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Organization organization) {
		System.out.println(organization);
		if (organizationService.insert(organization) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id,ModelMap map) {
		System.out.println(id);
		//map.put("record",roleService.selectById(role.getId()));
		map.put("record",organizationService.selectByPrimaryKey(id));
		return "/system/organization/edit";
	}
	
	
	
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Organization organization) {
		System.out.println("修改ID为:"+organization.getId()+"的字段");
		if (organizationService.updateByPrimaryKey(organization) > 0) {
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
		System.out.println("id为"+id);
		if (organizationService.deleteByPrimaryKey(id) > 0) {
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
		
		if (organizationService.batchDelete(ids) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	/*
	 * 测试接口
	 */
	/*@RequestMapping("/Check")
	@ResponseBody
	public Role check() {
		//Integer i=2;
		return roleService.selectByPrimaryKey(1);
	}*/
	
}
