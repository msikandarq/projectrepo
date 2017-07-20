package com.newt.service;

import java.util.List;

import com.newt.bean.Item;

public class SampleServiceImpl {

	public void getItems() {

	}

	public double calculatePriceWithGST(List<Item> items) {
		double finalTotal = 0;
		for (Item item : items) {
			double itemTotal = item.getPrice() * item.getItemQty();
			finalTotal += itemTotal;
		}

		// 10% GST
		double priceAfterGST = finalTotal + (finalTotal / 10);
		return priceAfterGST;
	}

	public double calcualtePriceWithTax(List<Item> items) {
		double finalTotal = 0;
		double vatRate = 12.5;
		double serviceTaxRate = 2.5;

		for (Item item : items) {
			double itemTotal = item.getPrice() * item.getItemQty();
			finalTotal += itemTotal;
		}

		double vatAmt = finalTotal / vatRate;
		double serviceTaxAmt = finalTotal / serviceTaxRate;
		double totalAfterTax = finalTotal + vatAmt + serviceTaxAmt;

		return totalAfterTax;
	}
}
