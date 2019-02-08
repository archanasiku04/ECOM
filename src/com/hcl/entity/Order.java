package com.hcl.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue
	@Column(name="order_id")
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users users;
	
	
	@Column(name="order_date")
	private Date date;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	
	public Order() {
		super();
	}

	public Order(Users users, Date date, Cart cart) {
		super();
		this.users = users;
		this.date = date;
		this.cart = cart;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Users getUsers() {
		return users;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", users=" + users + ", date=" + date + ", cart=" + cart + ", address="
				+ address + "]";
	}
	
	
}
