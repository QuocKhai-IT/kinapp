package com.example.demo.service.user;

import com.example.demo.domain.user.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.user.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAll(){
		return  productRepository.findAll();
	}
}
