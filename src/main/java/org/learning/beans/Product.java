package org.learning.beans;

public class Product {

	
	public Product() {
		
	}
	
	public Product(long idProduct, String nameProduct, String type, double price) {
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.type = type;
		this.price = price;
	}

	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	private long idProduct;
	private String nameProduct;
	private String type;
	private double price;
}
