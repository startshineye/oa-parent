package com.yxm.oa.flow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxm.oa.flow.mapper.ApplicationMapper;
import com.yxm.oa.flow.model.Application;
import com.yxm.oa.flow.service.ApplicationService;

@Service("applicationService")
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationMapper applicationMapper;

	public void create(Application application) {
		// TODO Auto-generated method stub
		applicationMapper.create(application);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		System.out.println("delete ....");
		applicationMapper.delete(id);
	}

	public Application findById(Long id) {
		// TODO Auto-generated method stub
		return applicationMapper.findById(id);
	}

}
