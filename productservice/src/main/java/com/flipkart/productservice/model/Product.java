package com.flipkart.productservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prod_ID;

    private String prod_name;
    private String prod_type;
    private int quantitiy;
    private double price;
	public Long getProd_ID() {
		return prod_ID;
	}
	public void setProd_ID(Long prod_ID) {
		this.prod_ID = prod_ID;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_type() {
		return prod_type;
	}
	public void setProd_type(String prod_type) {
		this.prod_type = prod_type;
	}
	public int getQuantitiy() {
		return quantitiy;
	}
	public void setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prod_ID=" + prod_ID + ", prod_name=" + prod_name + ", prod_type=" + prod_type + ", quantitiy="
				+ quantitiy + ", price=" + price + ", getProd_ID()=" + getProd_ID() + ", getProd_name()="
				+ getProd_name() + ", getProd_type()=" + getProd_type() + ", getQuantitiy()=" + getQuantitiy()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

   
}
