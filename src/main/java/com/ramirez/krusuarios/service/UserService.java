package com.ramirez.krusuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ramirez.krusuarios.model.User;
import com.ramirez.krusuarios.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository repo = new UserRepository();

	public UserService() {
	}

	public List<User> obtenerTodos() {
		return repo.findAll();
	}

	public void registrar(User user) {
		repo.save(user);
	}

	public boolean eliminar(Long id) {
		return repo.delete(id);
	}

}
