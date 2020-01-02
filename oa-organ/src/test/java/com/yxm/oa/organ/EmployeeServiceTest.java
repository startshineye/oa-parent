package com.yxm.oa.organ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yxm.oa.organ.model.Employee;
import com.yxm.oa.organ.service.EmployeeService;

@ContextConfiguration(locations = {"classpath:application-organ.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testAdd() {
		Employee employee = new Employee();
		employee.setName("张三");
		employee.setAge(23);
		employeeService.add(employee);
	}
	
	
	@Test
	public void testFindById() {
		Employee empoyee = employeeService.findById(1);
	}

}
