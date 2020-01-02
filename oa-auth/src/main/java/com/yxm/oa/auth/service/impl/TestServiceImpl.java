package com.yxm.oa.auth.service.impl;

public class TestServiceImpl {
  public String test(String name) {
	  System.out.println("name:"+name);
	  System.out.println("return :hello,"+name);
	  return "hello,"+name;
  }
}
