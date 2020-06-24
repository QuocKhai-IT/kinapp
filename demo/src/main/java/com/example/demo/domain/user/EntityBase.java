package com.example.demo.domain.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class EntityBase {
    @Id
    private String id;
    private long createdDate;
    private String createdBy;
    private long  updatedDate;
    private long   updatedBy;
}
