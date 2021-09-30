package com.moglix.ordermanagementsystem.dto;

public class Inventory {
	private String invId;
	private String userId;
	private String productId;
	private String productqty;
	private String productPrice;
	public Inventory(String invId, String userId, String productId, String productqty, String productPrice) {
		super();
		this.invId = invId;
		this.userId = userId;
		this.productId = productId;
		this.productqty = productqty;
		this.productPrice = productPrice;
	}
	public String getInvId() {
		return invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductqty() {
		return productqty;
	}
	public void setProductqty(String productqty) {
		this.productqty = productqty;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}


}
