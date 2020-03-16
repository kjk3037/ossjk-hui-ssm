package com.ossjk.ossjkssm.device.controller;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.device.entity.Devicereceive;
import com.ossjk.ossjkssm.device.service.DeviceService;
import com.ossjk.ossjkssm.device.service.DevicereceiveService;
import com.ossjk.ossjkssm.device.service.DevicetypeService;
import com.ossjk.ossjkssm.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
@RequestMapping("/device/devicereceive")
@Controller
public class DevicereceiveController extends BaseController{
	@Autowired
	private DeviceService deviceService;
	
	@Autowired
	private UserService userService;
	@Autowired
	private DevicetypeService devicetypeService;
	@Autowired
	private DevicereceiveService devicereceiveService;
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public String list(Page page, ModelMap map) {
		map.put("page", devicereceiveService.selectPage(page));
		return "device/devicereceive/list";
	}

	/**
	 * 去增加
	 */
	@RequestMapping("/toInsert")
	public String toInsert(ModelMap map) {
		map.put("users", userService.selectAll());
		map.put("devices", deviceService.selectReceive());
		return "device/devicereceive/edit";
	}

	/**
	 * 去更新
	 */
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id, ModelMap map) {

		map.put("record", devicereceiveService.selectByPrimaryKey(id));
		map.put("users", userService.selectAll());
		
		map.put("devices", deviceService.selectReceive());
		return "device/devicereceive/edit";
	}

	/**
	 * 增加
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Devicereceive device) {
		
		device.setStatus(1);
		device.setCrtm(new Date());
		device.setMdtm(new Date());
		device.setCode(deviceService.selectCodeById(device.getDid()).getCode());
		
		if (devicereceiveService.insert(device) > 0) {
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
	public Object update(Devicereceive device) {
		device.setMdtm(new Date());
		if (devicereceiveService.updateByPrimaryKey(device) > 0) {
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
		if (devicereceiveService.deleteByPrimaryKey(id) > 0) {
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
		if (deviceService.batchDelete(ids) > 0) {
			return new AjaxReturn(Constant.RETURN_CODE_SUCCESS, Constant.RETURN_MESSAGE_SUCCESS);
		} else {
			return new AjaxReturn(Constant.RETURN_CODE_ERROR, Constant.RETURN_MESSAGE_ERROR);
		}
	}
	@RequestMapping("/toback")
	public String toback(Integer id,ModelMap map) {
		map.put("users", userService.selectAll());
		map.put("devices", deviceService.selectReceive());
		map.put("record", devicereceiveService.selectByPrimaryKey(id));
		return "device/devicereceive/back";
	}
	/**
	 * 测试接口
	 */
	@RequestMapping("/test")
	@ResponseBody
	public void test(){

		System.out.println(deviceService.selectCodeById(4).getCode());
	}
}
