package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@Autowired 
	private CustomerRepository customerRepository ;
	@Autowired
	private AddressRepository addressRepository;
	
	//แสดงหน้า index
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	//ใช้ในการแสดงข้อมูลทั้งหมดของ customer โดยไปค้นหาข้อมูลในฐานข้อมูล และส่งไปยังแสดงยังหน้าเว็บ
	@RequestMapping("/showAllCustomer")
	public String CustomerForm(Model model) {
			List<Customer> customers = (List<Customer>) customerRepository.findAll();
			List<Address> addresses = (List<Address>) addressRepository.findAll();
			model.addAttribute("customers",customers);
			model.addAttribute("addresses",addresses);
	return "showAllCustomer";
	}
	//แสดงหน้าเพิ่มข้อมูล customer
	@RequestMapping("/addCustomer")
	public String addCustomerPage() {
		return "addCustomer";
	}
	//แสดงหน้าค้นหา customer ผ่าน id
	@RequestMapping("/FindCustomer")
	public String findCustomer() {
		return "FindCustomer";
	}
	
	//รับข้อมูลจากหน้าเว็บเพื่อเพิ่มข้อมูล customer,address ลงฐานข้อมูล
	@PostMapping("/add-new-customer")
	public String addNewCustomer(@Validated Customer cus,@Validated Address add, BindingResult result, Model model) {
		if (result.hasErrors()) {
	    	
	          return "addCustomer";
	      }
		cus.setAddress(add);
		add.setCustomer(cus);
	    customerRepository.save(cus);
	    addressRepository.save(add);
		return "redirect:/";
	}
	//รับข้อมูล id จากหน้าเว็บเพื่อไปค้นหา customer ผ่าน id
	@PostMapping("/find-customer")
	public String findCus(@Validated Customer cus, Model model) {
		int id = cus.getId();
		Customer customer = customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid customer id"+id));
		model.addAttribute("customer",customer);
		return "ShowFindCustomer";
	}
	
}
