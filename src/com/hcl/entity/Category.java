package com.hcl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="cat_name")
	private String catName;
	
	@Column(name="cat_desc")
	private String catDesc;
	
	

	public Category() {
		super();
	}

	public Category(String catName, String catDesc, Set<Products> product) {
		super();
		this.catName = catName;
		this.catDesc = catDesc;
		
	}

	public Category(String catName, String catDesc) {
		super();
		this.catName = catName;
		this.catDesc = catDesc;
	}
	public Category(int categoryId, String catName, String catDesc) {
		super();
		this.categoryId = categoryId;
		this.catName = catName;
		this.catDesc = catDesc;
		
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", catName=" + catName + ", catDesc=" + catDesc + "]";
	}
	
	
}
