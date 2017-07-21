package com.newt.model;

public class ItemModel {
	
	private String itemName;
	private double price;
	private int itemQty;
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the itemQty
	 */
	public int getItemQty() {
		return itemQty;
	}
	/**
	 * @param itemQty the itemQty to set
	 */
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
}
