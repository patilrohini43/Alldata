package com.bridgelabz.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fruit")
public class Fruits {
	
	@Id
	@Column(name="Id")
	private String id;
	@Column(name="Fruit_Name")
	private String name;
	@Column(name="Quntity")
	private String qty;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	
	
	
	

}
