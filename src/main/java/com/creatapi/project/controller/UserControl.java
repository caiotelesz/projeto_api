package com.creatapi.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creatapi.project.DAO.IUsers;
import com.creatapi.project.entities.Users;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserControl {

	@Autowired
	private IUsers dao;
	
	@GetMapping
	public List<Users> listUsers () {
		return (List<Users>) dao.findAll();
	}

	// Em caso do usuario criar a conta
	@PostMapping
	public Users createUsers (@RequestBody Users userNew) {
		Users newUser = dao.save(userNew);
		return newUser;
	}
	
	// Em caso do usuario trocar de nome / email / senha
	@PutMapping
	public Users editUsers (@RequestBody Users userNew) {
		Users newUser = dao.save(userNew);
		return newUser;
	}
	
	// Em caso do usuario excluir a conta
	@DeleteMapping("/{id}")
	public Optional<Users> deleteUsers (@PathVariable Integer id) {
		Optional<Users> deletUser = dao.findById(id);
		dao.deleteById(id);
		return deletUser;
	}
}
