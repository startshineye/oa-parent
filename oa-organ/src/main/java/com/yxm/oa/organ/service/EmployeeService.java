package com.yxm.oa.organ.service;

import com.yxm.oa.organ.model.Employee;

public interface EmployeeService {
    void add(Employee employee);
    Employee findById(Integer id);
}
