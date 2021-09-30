package com.moglix.ordermanagementsystem.dto;

public class Category {
	public Category(String catId, String catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}
	private String catId;
	private String catName;
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

}
