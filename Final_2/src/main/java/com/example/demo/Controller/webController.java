package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.*;
import com.example.demo.Repository.*;

@Controller
public class webController {
	
	@Autowired 
	private CustomerRepository cusRepo;
	@Autowired 
	private InvoiceRepository InvRepo;
	
	//แสดงหน้า index
	@RequestMapping("/")
	public String Index() {
		return "index.html";
	}
	
	//แสดงหน้า addInvoice และส่งข้อมูล customer ไปยังหน้าเว็บ
	@RequestMapping("/addInvoice")
	public String addInvoice(Model model) {
		List<Customer> cus =  (List<Customer>) cusRepo.findAll();
		model.addAttribute("customers", cus);
		return "addInvoice";
	}
	//รับข้อมูลจากหน้าเว็บ และนำไปเพิ่มลงฐานข้อมูล Invoice
	@PostMapping("/add-new-Invoice")
	public String addNewInvoid(@Validated Invoice inv, BindingResult result, Model model) {
		if (result.hasErrors()) {
	          return "addInvoice";
	      }
		InvRepo.save(inv);
		return  "redirect:/";
	}
	
	//ลบข้อมูล invoice ผ่าน id
	@PostMapping("/delete-Invoice")
	public String deleteInvoice(@Validated Invoice inv) {
		int id = inv.getId();
		Invoice invoice = InvRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Invoice id"+id));
		InvRepo.delete(invoice);
		return "redirect:/";
	}
}
