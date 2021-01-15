package com.Edgeserver.server.models;

public class User {

	private int id;
	private String emailId;
	private String userName;
	private String password;
//	private ArrayList<String> products;
//	private double priceTotal;

	public User() {

	}

	public User(int id, String emailId, String userName, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
//		this.products = new ArrayList<String>();
//		this.priceTotal = 0.00;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public ArrayList<String> getProducts() {
//		return products;
//	}
//
//	public void setProducts(ArrayList<String> products) {
//		this.products = products;
//	}
//
//	public double getPriceTotal() {
//		return priceTotal;
//	}
//
//	public void setPriceTotal(double priceTotal) {
//		this.priceTotal = priceTotal;
//	}

}
