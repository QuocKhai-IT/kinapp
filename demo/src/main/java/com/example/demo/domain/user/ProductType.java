package com.example.demo.domain.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class ProductType {
    @Id
    private String id;
    private String typeName;

    @OneToMany
    List<Product> product;
}
