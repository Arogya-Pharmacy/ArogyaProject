package com.arogya.model;

public class OrderPojo {
private int productSubcatId;
private String productSubcatName;
private int productSubcatQuantity;
private int productSubcatCost;
private String image;



public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public int getProductSubcatId() {
	return productSubcatId;
}
public void setProductSubcatId(int productSubcatId) {
	this.productSubcatId = productSubcatId;
}
public String getProductSubcatName() {
	return productSubcatName;
}
public int getProductSubcatCost() {
	return productSubcatCost;
}
public void setProductSubcatCost(int productSubcatCost) {
	this.productSubcatCost = productSubcatCost;
}
public void setProductSubcatName(String productSubcatName) {
	this.productSubcatName = productSubcatName;
}
public int getProductSubcatQuantity() {
	return productSubcatQuantity;
}
public void setProductSubcatQuantity(int productSubcatQuantity) {
	this.productSubcatQuantity = productSubcatQuantity;
}



}
