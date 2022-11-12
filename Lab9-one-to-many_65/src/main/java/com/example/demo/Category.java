package com.example.demo;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
 	private Integer category_id;
    @Column(length=45, nullable=false, unique=true)
	private String name;
	 
    public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	@OneToMany(targetEntity=Product.class, mappedBy="category",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;
    public List<Product> getProducts(){
    	return products;
    };
    public void setProducts(List<Product> p) {
    	this.products=p;
    }
	public Category() {
		super();
	}

	public Category(String name2) {
		this.name=name2;
	}

	@Override
	public String toString() {
		return "Category [id=" + category_id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
}
