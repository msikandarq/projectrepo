package com.newt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.newt.bean.Item;
import com.newt.model.ItemModel;
import com.newt.service.SampleService;
import com.newt.service.SampleServiceImpl;

@Controller
public class ItemController {

	@RequestMapping("/itemform")
	public ModelAndView itemForm() {
		// command is a reserved request attribute name, now use <form> tag to
		
		return new ModelAndView("itemform", "command", new ItemModel());
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public ModelAndView calculate(@ModelAttribute("emp") ItemModel itemModel, final Model model) {

		SampleService sampleService = new SampleServiceImpl();
		List<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setName(itemModel.getItemName());
		item.setItemQty(itemModel.getItemQty());
		item.setPrice(30000);
		items.add(item);

		double priceAfterGST = sampleService.calcualtePriceWithTax(items);
		double gstPrice = priceAfterGST - itemModel.getItemQty() * item.getPrice();
		
		itemModel.setGstPrice(gstPrice);
		itemModel.setPrice(item.getPrice());
		itemModel.setFinalTotal(priceAfterGST);
		model.addAttribute("itemModel", itemModel);
		
		// return new ModelAndView("empform","command",emp);//will display
		// object data
		return new ModelAndView("itemresult");// will redirect to viewemp
												// request mapping
	}

}
