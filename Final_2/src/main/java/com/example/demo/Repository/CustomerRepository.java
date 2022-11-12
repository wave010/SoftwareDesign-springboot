package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
