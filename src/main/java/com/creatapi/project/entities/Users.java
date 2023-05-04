package com.creatapi.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username", length = 200, nullable = false)
	private String username;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "passwords", columnDefinition = "TEXT", nullable = false)
	private String passwords;
	
	@Column(name = "telephone", length = 15, nullable = false)
	private String telephone;
	
	// Get and Set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
