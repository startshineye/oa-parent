package com.yxm.oa.auth.mapper;

import com.yxm.oa.auth.model.Authorization;

public interface AuthorizationMapper {
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
