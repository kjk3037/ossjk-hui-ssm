package com.ossjk.ossjkssm.device.controller;

import com.ossjk.core.base.controller.BaseController;
import com.ossjk.core.vo.AjaxReturn;
import com.ossjk.core.vo.Page;
import com.ossjk.ossjkssm.common.Constant;
import com.ossjk.ossjkssm.device.entity.Device;
import com.ossjk.ossjkssm.device.entity.Devicetype;
import com.ossjk.ossjkssm.device.service.DeviceService;
import com.ossjk.ossjkssm.device.service.DevicetypeService;
import com.ossjk.ossjkssm.system.service.OrganizationService;
import com.ossjk.ossjkssm.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/device/devicetype")
@Controller
public class DeviceTypeController extends BaseController{
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private OrganizationService organizationService;
	@Autowired
	private UserService userService;
	@Autowired
	private DevicetypeService devicetypeService;
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public String list(Page page, ModelMap map) {
		map.put("page", devicetypeService.selectPage(page));
		return "device/devicetype/list";
	}

	/**
	 * 去增加
	 */
	@RequestMapping("/toInsert")
	public String toInsert(ModelMap map) {
		
		/*map.put("users", userService.selectAll());
		map.put("organizations", organizationService.selectAll());*/
		map.put("devicetypes", devicetypeService.selectAll());
		return "device/devicetype/edit";
	}

	/**
	 * 去更新
	 */
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id, ModelMap map) {

		map.put("record", deviceService.selectByPrimaryKey(id));
		map.put("users", userService.selectAll());
		map.put("organizations", organizationService.selectAll());
		map.put("devicetypes", devicetypeService.selectAll());
		return "device/device/edit";
	}

	/**
	 * 增加
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public Object insert(Devicetype device) {

		if (devicetypeService.insert(device) > 0) {
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
	public Object update(Device device) {
		if (deviceService.updateByPrimaryKey(device) > 0) {
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
		if (deviceService.deleteByPrimaryKey(id) > 0) {
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
	/**
	 * 测试接口
	 */
	@RequestMapping("/test")
	@ResponseBody
	public Device test(){
		return deviceService.selectByPrimaryKey(2);
	}
}
