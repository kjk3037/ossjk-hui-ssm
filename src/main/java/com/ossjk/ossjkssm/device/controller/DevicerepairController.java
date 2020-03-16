package com.ossjk.ossjkssm.device.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.device.entity.Devicerepair;
import com.ossjk.ossjkssm.device.service.DeviceService;
import com.ossjk.ossjkssm.device.service.DevicerepairService;
import com.ossjk.ossjkssm.system.service.UserService;
@RequestMapping("/device/devicerepair")
@Controller
public class DevicerepairController extends BaseController{
	@Autowired
	private DevicerepairService devicerepairService;
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private UserService userService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public String list(Page page, ModelMap map) {
		map.put("page", devicerepairService.selectPage(page));
		return "device/devicerepair/list";
	}

	/**
	 * 去增加
	 */
	@RequestMapping("/toInsert")
	public String toInsert(ModelMap map) {
		
		map.put("users", userService.selectAll());
		map.put("devices", deviceService.selectReceive());
		//map.put("devicetypes", devicetypeService.selectAll());
		return "device/devicerepair/edit";
	}

	/**
	 * 去更新
	 */
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id, ModelMap map) {

		map.put("record", devicerepairService.selectByPrimaryKey(id));
		map.put("users", userService.selectAll());
		map.put("devices", deviceService.selectAll());
		//map.put("devicetypes", devicetypeService.selectAll());
		return "device/devicerepair/edit";
	}

	/**
	 * 增加
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Devicerepair device) {
	/*	device.setCode(Change.creadLS(devicerepairService.selectCode().getCode()));
		device.setSno(Change.creadDJS(devicerepairService.selectCode().getSno()));*/
		device.setCrtm(new Date());
		device.setMdtm(new Date());
		device.setStatus(1);
		if (devicerepairService.insert(device) > 0) {
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
	public Object update(Devicerepair device) {
		if (devicerepairService.updateByPrimaryKey(device) > 0) {
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
		if (devicerepairService.deleteByPrimaryKey(id) > 0) {
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
		if (devicerepairService.batchDelete(ids) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	/**
	 * 测试接口
	 */
	@RequestMapping("/toback")
	public String toback(ModelMap map,Integer id) {
		map.put("users", userService.selectAll());
		map.put("devices", deviceService.selectReceive());
		map.put("record", devicerepairService.selectByPrimaryKey(id));
		return "device/devicerepair/back";
	}
	@RequestMapping("/test")
	@ResponseBody
	public Devicerepair test(){
		return devicerepairService.selectByPrimaryKey(2);
	}
}
