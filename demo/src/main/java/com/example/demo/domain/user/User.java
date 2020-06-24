package com.example.demo.domain.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	private String id;
	private String fullName;
	private String phone;
	private String password;
	private String address;
	private boolean isAdmin;
	private boolean	isActive;
	private String deviceToken;
}
