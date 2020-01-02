package com.yxm.oa.organ.mapper;

import com.yxm.oa.organ.model.Employee;

public interface EmployeeMapper {
  void add(Employee employee);
  Employee findById(Integer id);
}
