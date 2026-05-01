package com.ramirez.krusuarios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramirez.krusuarios.model.User;
import com.ramirez.krusuarios.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@GetMapping
	public List<User> getUsuarios() {
		return service.obtenerTodos();
	}

	@PostMapping
	public String postUsuario(@RequestBody User user) {
		service.registrar(user);
		return "Usuario registrado correctamente.";
	}

	@DeleteMapping("/{id}")
	public String deleteUsuario(@PathVariable Long id) {
		return service.eliminar(id) ? "Usuario eliminado correctamente." : "Usuario no encontrado.";
	}

}
