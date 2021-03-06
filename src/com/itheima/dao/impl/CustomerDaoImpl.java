package com.itheima.dao.impl;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(Integer id) {
		return this.getSqlSession().selectOne("com.itheima.po.CustomerMapper.findCustomerById", id);
	}

}
