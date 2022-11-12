package com.example.demo;
 
import java.util.*;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.lang.String;
@Controller // This means that this class is a Controller
public class ProductController {
  @Autowired // This means to get the bean called userRepository
  private ProductRepository productRepository;
  @Autowired // This means to get the bean called userRepository
  private CategoryRepository categoryRepository;

  @RequestMapping("/")
  public String root(Model model) {
    return "index";
  }
  
 
  @RequestMapping("/list_product")
  public String productForm(Model model) {
   
	  List<Product> products = (List<Product>) productRepository.findAll();
	  model.addAttribute("product",products);
    return "productList";
  }
  
  @GetMapping("/delete_product/{id}")
  public String deleteUser(@PathVariable("id") long id, Model model) {
      Product product = productRepository.findById((int) id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
      productRepository.delete(product);
      return "redirect:/list_product";
  }
  @PostMapping("/update_product/{id}")
  public String updateProduct(@PathVariable("id") Integer id, @Validated  Product product, 
    BindingResult result, Model model) {
 //    System.out.println(id); 
	// System.out.println(product.getId()+ product.getName());
	 System.out.println(product);
	if (result.hasErrors()) {
		product.setId(id);
	//	List<Category> categoryList = (List<Category>) categoryRepository.findAll();
	//      model.addAttribute("categorytList", categoryList);     
          return "update_product";
      }
	 
    
      productRepository.save(product);
      return "redirect:/list_product";
  }
  @GetMapping("/edit_product/{id}")
  public String showUpdateForm(@PathVariable("id") int id, Model model) {
      Product product = productRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
      
	  List<Category> categoryList = (List<Category>) categoryRepository.findAll();
      System.out.println("in get update_product");
      model.addAttribute("categoryList",categoryList);
      model.addAttribute("product", product);
      System.out.println(categoryList);
      return "update_product";
  }
  
  @PostMapping("/new_product")
  public String addUser(@Validated Product product, BindingResult result, Model model) {
      if (result.hasErrors()) {
    	  List<Category> categoryList = (List<Category>) categoryRepository.findAll();
          model.addAttribute("categorytList", categoryList);
          return "new_product";
      }
       
      productRepository.save(product);
      return "redirect:/list_product";
  }
  @GetMapping("/new_product")
  public String showForm(Model model) {
      Product product = new Product();
      model.addAttribute("product", product);
       
    
      List<Category> categoryList = (List<Category>) categoryRepository.findAll();
      model.addAttribute("categoryList", categoryList);
      return "new_product";
  }
 
}