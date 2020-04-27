package com.globomart.productcatlogue.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.globomart.productcatlogue.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

	ArrayList<Product> findAll();

}
