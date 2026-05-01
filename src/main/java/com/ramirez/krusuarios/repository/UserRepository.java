package com.ramirez.krusuarios.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ramirez.krusuarios.model.User;

@Repository
public class UserRepository {

	private List<User> database = new ArrayList<User>();

	public UserRepository() {
		database.add(new User(1L, "Ana Torres", "ana@correo.com", 25));
		database.add(new User(2L, "Carlos Ruiz", "carlos@correo.com", 30));
		database.add(new User(3L, "Maria Lopez", "maria@correo.com", 22));
	}

	public List<User> findAll() {
		return database;
	}

	public void save(User user) {
		database.add(user);
	}

	public boolean delete(Long id) {
		return database.removeIf(u -> u.getId().equals(id));
	}

}
