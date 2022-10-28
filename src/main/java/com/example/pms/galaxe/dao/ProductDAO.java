package com.example.pms.galaxe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.pms.galaxe.model.Product;

public interface ProductDAO extends CrudRepository<Product,Integer> {

	public List<Product> findByProductName(String productName);
	public List<Product> findByPrice(int price);
	public List<Product> findByPriceBetween(int minPrice,int maximumPrice);
	public List<Product> findByQuantityOnHandGreaterThan(int quantityOnHand);
//	@Query("select * from Product")
//	public List<Product> findAllProducts();
//	public List<Product> findAllProducts(String productName);

}
