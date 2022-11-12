package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Autowired 
	private CustomerRepository customerRepository ;
	@Autowired
	private AddressRepository addressRepository;
	
	@RequestMapping("/")
	public String CustomerForm(Model model) {
			List<Customer> customers = (List<Customer>) customerRepository.findAll();
			List<Address> addresses = (List<Address>) addressRepository.findAll();
			model.addAttribute("customers",customers);
			model.addAttribute("addresses",addresses);
			
	return "index";
	}

	
}
