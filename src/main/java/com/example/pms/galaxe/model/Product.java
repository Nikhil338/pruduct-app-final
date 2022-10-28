package com.example.pms.galaxe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@RestController
@Entity
@Table(name="freshproducts")
@Data
@AllArgsConstructor

public class Product {
	@Id
	private int productId;
	public String productName;
	private int quantityOnHand;
	private int price;
	
	public Product() {
	}
	

//	public Product(int productId, String productName, int quantityOnHand, int price) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.quantityOnHand = quantityOnHand;
//		this.price = price;
//	}
	


//	public int getProductId() {
//		return productId;
//	}
//
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//
//
//	public String getProductName() {
//		return productName;
//	}
//
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//
//	public int getQuantityOnHand() {
//		return quantityOnHand;
//	}
//
//
//	public void setQuantityOnHand(int quantityOnHand) {
//		this.quantityOnHand = quantityOnHand;
//	}
//
//
//	public int getPrice() {
//		return price;
//	}
//
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
//
//
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
//				+ ", price=" + price + "]";
//	}


	public static void main(String[] args) {
		

	}

}
