package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.*;

@RestController
public class CustomerController {
	
	@Autowired 
	private CustomerRepository cusRepo;
		
	//แสดงข้อมูล customer ทั้งหมด โดยส่งข้อมูลไปยังหน้าเว็บเป็น JSON
	@GetMapping("/showAllCustomer")
	public List<Customer> showAllCustomer(){
		List<Customer> customers = (List<Customer>) cusRepo.findAll();
		return customers;
	}
	//แสดงข้อมูล customer เฉพาะ id ที่ค้นหา แล้วส่งไปยังหน้าเว็บเป็น JSON
	@PostMapping("/find-customer")
	public Customer findCus(@Validated Customer cus, Model model) {
		int id = cus.getId();
		Customer customer = cusRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid customer id"+id));
		return customer;
	}

}
