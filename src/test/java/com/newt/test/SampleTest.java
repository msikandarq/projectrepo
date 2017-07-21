package com.newt.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.newt.bean.Item;
import com.newt.service.SampleService;
import com.newt.service.SampleServiceImpl;
public class SampleTest {
	SampleService sampleService;
	List<Item> items = new ArrayList<Item>();
	@Before
	public void mockSetup() {
		sampleService = mock(SampleService.class);

		Item item = new Item();
		item.setName("Laptop");
		item.setItemQty(1);
		item.setPrice(30000);

		items.add(item);
		when(sampleService.calculatePriceWithGST(items)).thenReturn(33000.0);
	}
	
	@Test
	public void validateGSTPass() {
		//SampleServiceImpl sampleServiceImpl = new SampleServiceImpl();

		

		assertEquals(sampleService.calculatePriceWithGST(items), 33000.0, 0.0);
	}
	
	@Test
	public void validateGSTFail() {
		SampleServiceImpl sampleServiceImpl = new SampleServiceImpl();

		List<Item> items = new ArrayList<Item>();

		Item item = new Item();
		item.setName("Laptop");
		item.setItemQty(1);
		item.setPrice(30000);

		items.add(item);

		assertEquals(sampleServiceImpl.calculatePriceWithGST(items), 33000.0, 0.0);
	}
	
	@Test
	public void validateTaxPricePass() {
		SampleServiceImpl sampleServiceImpl = new SampleServiceImpl();
		List<Item> items = new ArrayList<Item>();

		Item item = new Item();
		item.setName("Laptop");
		item.setItemQty(1);
		item.setPrice(30000);

		items.add(item);

		assertEquals(sampleServiceImpl.calcualtePriceWithTax(items), 44400.0, 0.0);
	}

}
