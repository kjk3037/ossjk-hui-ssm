package com.ossjk.ossjkssm.device.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.device.entity.Devicesout;
import com.ossjk.ossjkssm.device.service.DeviceService;
import com.ossjk.ossjkssm.device.service.DevicesoutService;
import com.ossjk.ossjkssm.system.service.OrganizationService;
import com.ossjk.ossjkssm.system.service.UserService;
@RequestMapping("/device/devicesout")
@Controller
public class DevicesoutController extends BaseController{
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private UserService userService;
	@Autowired
	private DevicesoutService devicesoutService;
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public String list(Page page, ModelMap map) {
		map.put("page", devicesoutService.selectPage(page));
		return "device/devicesout/list";
	}

	/**
	 * 去增加
	 */
	@RequestMapping("/toInsert")
	public String toInsert(ModelMap map) {
		
		map.put("users", userService.selectAll());
		//map.put("organizations", organizationService.selectAll());
		map.put("devices", deviceService.selectReceive());
		return "device/devicesout/edit";
	}

	/**
	 * 去更新
	 */
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id, ModelMap map) {

		map.put("record", devicesoutService.selectByPrimaryKey(id));
		map.put("users", userService.selectAll());
		map.put("devices", deviceService.selectReceive());
		//map.put("organizations", organizationService.selectAll());
		//map.put("devicetypes", devicetypeService.selectAll());
		return "device/devicesout/edit";
	}

	/**
	 * 增加
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Devicesout device) {
		device.setCrtm(new Date());
		device.setMdtm(new Date());
		if (devicesoutService.insert(device) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}

	/**
	 * 更新
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Devicesout device) {
		device.setMdtm(new Date());
		if (devicesoutService.updateByPrimaryKey(device) > 0) {
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
		if (devicesoutService.deleteByPrimaryKey(id) > 0) {
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
		if (devicesoutService.batchDelete(ids) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	@RequestMapping("/tosout")
	public String tosout(Integer id,ModelMap map) {
		map.put("record",devicesoutService.selectByPrimaryKey(id));
		map.put("users",userService.selectAll());
		map.put("devices", deviceService.selectReceive());
		return "device/devicesout/tosout";
	}
	/**
	 * 测试接口
	 */
	@RequestMapping("/test")
	@ResponseBody
	public List<Devicesout> test(){
		System.out.println(devicesoutService.selectAll());
		return devicesoutService.selectAll();
	}
}
