package com.arogya.entity;

public class Order {
	private String custorder_id;
	private String subcat_id;
	private String customer_id;
	private String order_quantity;
	private String order_address_street;
	private String order_address_city;
	private String order_address_state;
	private String order_address_pincode;
	private String custRequestid;
	private String emp_request_qnty;
	public String getEmp_request_qnty() {
		return emp_request_qnty;
	}
	public void setEmp_request_qnty(String emp_request_qnty) {
		this.emp_request_qnty = emp_request_qnty;
	}
	private String product_subcat_id;
	private String product_subcat_name;
	
	public String getProduct_subcat_name() {
		return product_subcat_name;
	}
	public void setProduct_subcat_name(String product_subcat_name) {
		this.product_subcat_name = product_subcat_name;
	}
	public String getProduct_subcat_id() {
		return product_subcat_id;
	}
	public void setProduct_subcat_id(String product_subcat_id) {
		this.product_subcat_id = product_subcat_id;
	}
	public String getCustRequestid() {
		return custRequestid;
	}
	public void setCustRequestid(String custRequestid) {
		this.custRequestid = custRequestid;
	}
	public String getCustorder_id() {
		return custorder_id;
	}
	public void setCustorder_id(String custorder_id) {
		this.custorder_id = custorder_id;
	}
	public String getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(String subcat_id) {
		this.subcat_id = subcat_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(String order_quantity) {
		this.order_quantity = order_quantity;
	}
	public String getOrder_address_street() {
		return order_address_street;
	}
	public void setOrder_address_street(String order_address_street) {
		this.order_address_street = order_address_street;
	}
	public String getOrder_address_city() {
		return order_address_city;
	}
	public void setOrder_address_city(String order_address_city) {
		this.order_address_city = order_address_city;
	}
	public String getOrder_address_state() {
		return order_address_state;
	}
	public void setOrder_address_state(String order_address_state) {
		this.order_address_state = order_address_state;
	}
	public String getOrder_address_pincode() {
		return order_address_pincode;
	}
	public void setOrder_address_pincode(String order_address_pincode) {
		this.order_address_pincode = order_address_pincode;
	}
	
	
	

}
