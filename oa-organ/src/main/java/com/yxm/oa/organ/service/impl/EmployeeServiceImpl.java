package com.yxm.oa.organ.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yxm.oa.organ.mapper.EmployeeMapper;
import com.yxm.oa.organ.model.Employee;
import com.yxm.oa.organ.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper employeeMapper;

	public void add(Employee employee) {
		employeeMapper.add(employee);
	}

	public Employee findById(Integer id) {
		 return employeeMapper.findById(id);
	}

}
