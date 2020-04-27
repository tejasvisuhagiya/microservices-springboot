package com.globomart.productcatlogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.productcatlogue.model.Product;
import com.globomart.productcatlogue.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	//creating a get mapping that retrieves all the students detail from the database 
	@GetMapping("/product")
	private List<Product> getAllProduct() 
	{
	return productService.getAllProduct();
	}
	//creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/product/{id}")
	private Product getProduct(@PathVariable("id") int id) 
	{
	return productService.getProductById(id);
	}
	//creating a delete mapping that deletes a specific student
	@DeleteMapping("/product/{id}")
	private void deleteProduct(@PathVariable("id") int id) 
	{
     	productService.delete(id);
	}
	//creating post mapping that post the student detail in the database
	@PostMapping("/product")
	private int saveProduct(@RequestBody Product product) 
	{
	productService.saveOrUpdate(product);
	  return product.getId();
	}
}
