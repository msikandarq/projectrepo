package com.newt.service;

import java.util.List;

import com.newt.bean.Item;

public interface SampleService {
	double calculatePriceWithGST(List<Item> items);
	
	double calcualtePriceWithTax(List<Item> items);
}
