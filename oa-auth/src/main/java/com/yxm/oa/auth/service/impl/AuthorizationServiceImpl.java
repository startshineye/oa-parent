package com.yxm.oa.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxm.oa.auth.mapper.AuthorizationMapper;
import com.yxm.oa.auth.model.Authorization;
import com.yxm.oa.auth.service.AuthorizationService;

@Service("authorizationService")
public class AuthorizationServiceImpl implements AuthorizationService{
	
	@Autowired
	private AuthorizationMapper mapper;

	public void authorize(Authorization auth) {
		System.out.println("authorize..."+auth);
		mapper.authorize(auth);
		
	}

	public void unauthorize(Long id) {
		System.out.println("unauthorize ....");
		mapper.unauthorize(id);
		
	}

	public Authorization findById(Long id) {
		System.out.println("findById ....");
		System.out.println("prepare excute end ....");
		return mapper.findById(id);
	}

}
