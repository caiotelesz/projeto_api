package com.creatapi.project.DAO;

import org.springframework.data.repository.CrudRepository;

import com.creatapi.project.entities.Users;

public interface IUsers extends CrudRepository<Users, Integer>{

}
