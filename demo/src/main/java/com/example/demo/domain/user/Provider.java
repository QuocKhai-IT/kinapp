package com.example.demo.domain.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Provider {
    @Id
    private String id;
    private String productName;

    @OneToMany
    List<Product> product;
}
