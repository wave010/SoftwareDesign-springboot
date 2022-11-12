package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class SimpleWebController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/form", method=RequestMethod.GET) //รับค่าข้อมูลจา form 
	public String customerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "form";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)// ส่งค่าข้อมูลไปยัง result
	public String customerSubmit(@ModelAttribute Customer customer, Model model) {
	model.addAttribute("customer", customer );
	String info = String.format("Customer Submission: id = %d, firstname = %s", customer.getId(), customer.getFirstname());
	log.info(info);
	return "result";
	}
}
