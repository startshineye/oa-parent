package com.yxm.oa.web.controller;

import static org.junit.Assert.assertEquals;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.yxm.oa.organ.model.Employee;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:application-web.xml","classpath:spring-servlet.xml"})
public class WebControllerTest {
	@Resource
	private WebController webController;
	
	@Test
	public void testAddEmployee() {
		Employee employee = new Employee();
		employee.setName("张三");
		employee.setAge(23);
		String addEmployee = webController.addEmployee(employee);
		assertEquals(true, "ok".equals(addEmployee));
	}
}
