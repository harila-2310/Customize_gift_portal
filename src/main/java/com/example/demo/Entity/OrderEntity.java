package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class OrderEntity {

	@Id
	@GeneratedValue
	private int o_id;
	private int cust_id;
	private String name;
	private String address;
	private int quantity;
	private int pincode;
	private String type_of_delivery;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="gift_id")
	private List<GiftEntity> cs;

	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderEntity(int o_id, int cust_id, String name, String address, int quantity, int pincode,
			String type_of_delivery, List<GiftEntity> cs) {
		super();
		this.o_id = o_id;
		this.cust_id = cust_id;
		this.name = name;
		this.address = address;
		this.quantity = quantity;
		this.pincode = pincode;
		this.type_of_delivery = type_of_delivery;
		this.cs = cs;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getType_of_delivery() {
		return type_of_delivery;
	}

	public void setType_of_delivery(String type_of_delivery) {
		this.type_of_delivery = type_of_delivery;
	}

	public List<GiftEntity> getCs() {
		return cs;
	}

	public void setCs(List<GiftEntity> cs) {
		this.cs = cs;
	}
	
	
	
}
