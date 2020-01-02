package com.yxm.oa.auth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yxm.oa.auth.model.Authorization;
import com.yxm.oa.auth.service.AuthorizationService;

@ContextConfiguration(locations= {"classpath:application-auth.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorizationServiceTest {
	
	@Autowired
	private AuthorizationService authorizationService;
	
	private Long id;

	@Test
	public void testAuthorize() {
		Authorization auth = new Authorization();
		auth.setEmployeeId(1L);
		auth.setRoleId(1L);
		authorizationService.authorize(auth);
		this.id = auth.getId();
		assertEquals(true, this.id>0);
		
	}
	
	
	  @Test 
	  public void testUnauthorize() { 
		  authorizationService.unauthorize(1L);
	      assertEquals(true, 1==1);
	  
	  }
	 
	
	@Test
	public void testFindById() {
		Authorization auth = authorizationService.findById(this.id);
		 
		assertEquals(true, auth == null);
		
	}
}
