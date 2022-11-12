package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Invoice;



public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
}
