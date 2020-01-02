package com.yxm.oa.auth.service;

import com.yxm.oa.auth.model.Authorization;

public interface AuthorizationService {
	/**
	 * 授权
	 * @param auth
	 */
	void authorize(Authorization auth);
	/**
	 * 解除授权
	 * @param id
	 */
	void unauthorize(Long id);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	Authorization findById(Long id);

}
