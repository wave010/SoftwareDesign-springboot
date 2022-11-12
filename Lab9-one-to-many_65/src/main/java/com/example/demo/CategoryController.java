package com.example.demo;

import java.util.Arrays;
import java.util.List;

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

@Controller // This means that this class is a Controller
public class CategoryController {
  @Autowired // This means to get the bean called userRepository
  private CategoryRepository categoryRepository;

  @RequestMapping("/list_category")
  public String getCategoryList(Model model) {
	  System.out.println("Test in categoryList");
	  List<Category> categoryList = categoryRepository.findAll();
	  model.addAttribute("categoryList",categoryList);
	  return "categoryList";
  }
  
  @GetMapping("/delete_category/{id}")
  public String deleteUser(@PathVariable("id") long id, Model model) {
      Category category = categoryRepository.findById((int) id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid category Id:" + id));
      categoryRepository.delete(category);
      return "redirect:/list_category";
  }
  @PostMapping("/update_category/{id}")
  public String updateProduct(@PathVariable("id") Integer id, @Validated  Category category, 
    BindingResult result, Model model) {
     System.out.println(id); 
	 System.out.println(category.getCategory_id() + category.getName());
	if (result.hasErrors()) {
		  category.setCategory_id(id);
          return "update_category";
      }
          
		categoryRepository.save(category);
      return "redirect:/list_category";
  }
  @GetMapping("/edit_category/{id}")                  //เราต้องระวัง ในแต่ละคอนโทรล ห้ามมี Url ซ้ำกัน เช่น ห้ามมี /edit/{id} ในคอนโทรลเลอร์ตัวอื่น
  public String showUpdateForm(@PathVariable("id") int id, Model model) {
      Category category = categoryRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid category Id:" + id));
      
      model.addAttribute("category", category);
      return "update_category";
  }
   
  
  @PostMapping("/new_category")
  public String addUser(@Validated Category category, BindingResult result, Model model) {
      if (result.hasErrors()) {
    	
          return "new_category";
      }
      
      categoryRepository.save(category);
      return "redirect:/list_category";
  }
  @GetMapping("/new_category")
  public String showForm(Model model) {
      Category category = new Category();
      model.addAttribute("category", category);
       
   
      return "new_category";
  }
  
}	
