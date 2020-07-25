package com.kt.springmockito.entity;

public class Item {

	private int id;
	private String name;
	private int quantity;
	private int price;

	public Item(int id, String name, int price,int quantity) {
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
