package com.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.entity.Customer;
import com.main.entity.Product;
import com.main.repository.CustomerRepository;
import com.main.service.ICustomerService;

@SpringBootApplication
public class SbDataJpaProj14OneToManyApplication
{

	 
	public static void main(String[] args) 
	{
		 ApplicationContext ctx = SpringApplication.run(SbDataJpaProj14OneToManyApplication.class, args);
		 ICustomerService service = ctx.getBean("cService", ICustomerService.class);
		 
			Product p1 = new Product("Apple i-phone XP", 3, 80000d);
			Product p2 = new Product("HP core i5 laptop",2, 400000d);
			List<Product> pList = List.of(p1,p2);
			
			Customer c1 = new Customer("Manoj","Jajpur","ssukanta531@gmail.com",pList);
			
			 service.createCustomer(c1);
		 
	     
	     ((ConfigurableApplicationContext) ctx).close();
	     
	}

}
