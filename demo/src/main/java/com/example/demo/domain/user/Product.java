package com.example.demo.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private String id;
	private String productName;
	private float price;
	private float priceBuy;
	private float priceSale;
	private double discount;
	private String guid;
	private String note;
	private boolean outOfStuck;

	@ManyToOne
	ProductType productType;

	@ManyToOne
	Provider provider;

	@ManyToOne
	Trademake trademake;

	@ManyToOne
	Origin origin;
}
