package com.hcl.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue
	@Column(name="cart_id")
	private int cartId;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Products> product;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="total_price")
	private double totalPrice;

	public Cart() {
		super();
	}
	

	public Cart(Set<Products> product, int quantity, double totalPrice) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}


	public Cart(int cartId, Set<Products> product, int quantity, double totalPrice) {
		super();
		this.cartId = cartId;
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}


	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Set<Products> getProduct() {
		return product;
	}

	public void setProduct(Set<Products> product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
}
