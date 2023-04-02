package com.codewithme.bumblebee.model;

public class Product {
	
	private int productCode;
	private String name;
	private double price;
	private String description;
	private String category;
	
	public Product(int productCode, String name, double price, String description, String category) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	public Product() {}
	
	public Product( String name, double price, String description, String category) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
