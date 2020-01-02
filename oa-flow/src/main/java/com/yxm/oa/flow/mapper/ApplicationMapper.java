package com.yxm.oa.flow.mapper;

import com.yxm.oa.flow.model.Application;

public interface ApplicationMapper {
	void create(Application application);
	
	void delete(Long id);
	
	Application findById(Long id);

}
