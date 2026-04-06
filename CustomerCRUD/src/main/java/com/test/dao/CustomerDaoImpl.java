package com.test.dao;
import java.sql.PreparedStatement;
import java.util.List;

import com.test.db.ConnectionDB;
import com.test.model.Customer;

public class CustomerDaoImpl implements CustomerDao
{
	@Override
	public int saveCustomer(Customer obj) 
	{
		return 0;
	}
	
	@Override
	public List<Customer> listAllCustomers()
	{
		return null;
	}
}
