package com.yxm.oa.flow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yxm.oa.flow.model.Application;
import com.yxm.oa.flow.service.ApplicationService;

@ContextConfiguration(locations= {"classpath:application-flow.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationServiceTest {
	
	@Autowired
	private ApplicationService applicationService;
	
	@Test
	public void testCreate() {
		 
		assertEquals(true,1>0);
	}

}
