package com.newt.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.newt.bean.Item;
import com.newt.service.SampleServiceImpl;

public class SampleTest {
	@Test
	public void validateGSTPass() {
		SampleServiceImpl sampleServiceImpl = new SampleServiceImpl();

		List<Item> items = new ArrayList<Item>();

		Item item = new Item();
		item.setName("Laptop");
		item.setItemQty(1);
		item.setPrice(30000);

		items.add(item);

		assertEquals(sampleServiceImpl.calculateGST(items), 3000.0, 0.0);
	}
	
	/*@Test
	public void validateGSTFail() {
		SampleServiceImpl sampleServiceImpl = new SampleServiceImpl();

		List<Item> items = new ArrayList<Item>();

		Item item = new Item();
		item.setName("Laptop");
		item.setItemQty(1);
		item.setPrice(30000);

		items.add(item);

		assertEquals(sampleServiceImpl.calculateGST(items), 300.0, 0.0);
	}*/
	
	@Test
	public void validateTaxPricePass() {
		SampleServiceImpl sampleServiceImpl = new SampleServiceImpl();
		List<Item> items = new ArrayList<Item>();

		Item item = new Item();
		item.setName("Laptop");
		item.setItemQty(1);
		item.setPrice(30000);

		items.add(item);

		assertEquals(sampleServiceImpl.calcualteTax(items), 44400.0, 0.0);
	}

}
