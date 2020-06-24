package com.example.demo.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.user.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
