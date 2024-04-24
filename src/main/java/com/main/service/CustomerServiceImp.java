package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Customer;
import com.main.entity.Product;
import com.main.repository.CustomerRepository;
import com.main.repository.ProductRepository;

@Service("cService")
public class CustomerServiceImp implements ICustomerService 
{

	@Autowired
	 private CustomerRepository custRepo;
	
	@Autowired
	 private ProductRepository pRepo;
	
	@Override
	public void createCustomer(Customer customer) 
	{
		Customer c = custRepo.save(customer);
		System.out.println("Parent Details");
		System.out.println("cid\tcname\tcaddr\temail");
		System.out.println(c.getCid()+"  "+c.getCname()+"  "+c.getCaddr()+"  "+c.getEmail());
		
		List<Product> pList = c.getProducts();
		System.out.println("Child Details");
		System.out.println("pid\tpname\tprice\tQty");
		 
		for(Product p : pList)
		{
			System.out.println(p.getPid()+"  "+p.getPname()+"  "+p.getPrice()+"  "+p.getQty());
		}
	}
 
}
