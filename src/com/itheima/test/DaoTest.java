package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;

/*
 * Dao测试类
 */
public class DaoTest {
	@Test
	public void findCustomerByIdDaoTest(){
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) applicationcontext.getBean("customerDao");
		Customer customer = customerDao.findCustomerById(1);
		System.out.println(customer);
	}
}
