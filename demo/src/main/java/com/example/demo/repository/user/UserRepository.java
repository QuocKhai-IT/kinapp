package com.example.demo.repository.user;

import com.example.demo.domain.user.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.user.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<Product> getProducts();
}
