package com.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="JPA_PRODUCT_TAB")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Product 
{
     
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NonNull
	private String pname;
	
	@NonNull
	private Integer qty;
	
	@NonNull
	private Double price;
	
}
