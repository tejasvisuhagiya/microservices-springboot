package com.globomart.productcatlogue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Product {
	
	public Product(int id, String productName, String productType) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
	}
	@Id
	//defining id as column name
	@Column
	private int id;

	@Column
	private String productName;
	@Column
	private String productType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProdctName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productType=" + productType + "]";
	}
}
