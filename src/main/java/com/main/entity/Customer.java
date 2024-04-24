package com.main.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_CUSTOMER_TAB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer 
{
	  @Id
	  @GeneratedValue
      private Integer cid;
	  
	  @NonNull
      private String cname;
	  
	  @NonNull
      private String caddr;
	  
	  @NonNull
      private String email;
      
      @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
      @JoinColumn(name="cp_fk", referencedColumnName = "cid")
      @NonNull
      private List<Product> products;
}
