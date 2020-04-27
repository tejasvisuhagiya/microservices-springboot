package com.globomart.productcatlogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.productcatlogue.model.Product;
import com.globomart.productcatlogue.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProduct() 
	{
	List<Product> products = new ArrayList<Product>();
	productRepository.findAll().forEach(product -> products.add(product));
	return products;
	}
	//getting a specific record
	public Product getProductById(int id) 
	{
	return productRepository.findById(id).get();
	}
	public void saveOrUpdate(Product product) 
	{
	productRepository.save(product);
	}
	//deleting a specific record
	public void delete(int id) 
	{
	productRepository.deleteById(id);
	}
}
