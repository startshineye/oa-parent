package com.yxm.oa.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxm.oa.auth.model.Authorization;
import com.yxm.oa.auth.service.AuthorizationService;
import com.yxm.oa.flow.model.Application;
import com.yxm.oa.flow.service.ApplicationService;
import com.yxm.oa.organ.model.Employee;
import com.yxm.oa.organ.service.EmployeeService;

@Controller
public class WebController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private AuthorizationService authorizationService;
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping("/addEmployee")
	@ResponseBody
	public String addEmployee(Employee employee) {
		try {
			employeeService.add(employee);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "ok";
	}
	
	@RequestMapping("/authorize")
	@ResponseBody
	public String authorize(Authorization authorization) {
		try {
			authorizationService.authorize(authorization);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "ok";
	}
	
	@RequestMapping("/createApplication")
	@ResponseBody
	public String createApplication(Application application) {
		try {
			applicationService.create(application);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "ok";
	}

}
