package com.vz.poc.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderCreate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	
	private String type;
	
	

	public OrderCreate() {
	}

	public OrderCreate(String type) {
		this.type = type;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
