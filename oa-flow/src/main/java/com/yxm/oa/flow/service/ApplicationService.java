package com.yxm.oa.flow.service;

import com.yxm.oa.flow.model.Application;

public interface ApplicationService {
    void create(Application application);
	
	void delete(Long id);
	
	Application findById(Long id);
}
