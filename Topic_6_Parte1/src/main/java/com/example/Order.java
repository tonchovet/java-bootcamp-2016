package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long account;
	private Long product;
	private int purchaseNumber;
	private int creditCard;

	public Order(Long account, Long product, int purchaseNumber, int creditCard) {
	
	this.account = account;
	this.product = product;
	this.purchaseNumber = purchaseNumber;
	this.creditCard = creditCard;
	}

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public Long getAccount() {
	return account;
	}

	public void setAccount(Long account) {
	this.account = account;
	}

	public Long getProduct() {
	return product;
	}

	public void setProduct(Long product) {
	this.product = product;
	}
	
	public int getCreditCard() {
		return creditCard;
	}

	public void setCredit_Card(int creditCard) {
		this.creditCard = creditCard;
	}
	
	public int getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(int purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}
}
