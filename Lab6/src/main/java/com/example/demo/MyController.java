package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    private ICustomerService customerService;
    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("go to index.html");
        return "index";
    }
    //@RequestMapping("/showCities")
    @GetMapping("/showCustomer")
    public String findCustomer(Model model) {
        var customers= (List<Customer>) customerService.findAll();
        if(customers.isEmpty())
            System.out.println("Customer are empty");
        for(var e:customers) {
            System.out.println(e);
        }
        model.addAttribute("customers", customers);

        return "showCustomer";
    }
}
