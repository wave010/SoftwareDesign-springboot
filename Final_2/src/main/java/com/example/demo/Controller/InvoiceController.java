package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Invoice;
import com.example.demo.Repository.InvoiceRepository;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceRepository InvRepo;
	
	//แสดงข้อมูล invoice ทั้งหมด ส่งไปยังหน้าเว็บเป็น JSON
	@GetMapping("/showAllInvoice")
	public List<Invoice> showAllInvoice(){
		List<Invoice> Invoices = (List<Invoice>) InvRepo.findAll();
		return Invoices;
	}
	//แสดงข้อมูล invoice ผ่าน id ส่งไปยังหน้าเว็ยเป็น JSON
	@PostMapping("/find-Invoice")
	public Invoice findInv(@Validated Invoice inv) {
		int id = inv.getId();
		Invoice invoice = InvRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid customer id"+id));
		return invoice;
	} 

}
