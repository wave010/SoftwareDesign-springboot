package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private Integer quantity;

	private double price;
	@ManyToOne(optional=false)
	@JoinColumn(name="category_id")
    private Category category;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category c) {
		this.category=c;
	}
	 
	public Product() {
		
		super();
		setQuantity(0);
		setPrice(0);
	}
	public Product(String name) {
		super();
		setName(name);
		
     }
	public Product(String name,Integer q) {
		super();
		setName(name);
		setQuantity(q);
     }
	public Product(String name,Integer q,Double thePrice) {
		super();
		setName(name);
		setQuantity(q);
		setPrice(thePrice);
     }
	public Integer getId() {
		return id;
	}

	public void setId(Integer id2) {
		this.id = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Quantity=" + quantity + ", Category="+category.getName()+ "]";
	}
}