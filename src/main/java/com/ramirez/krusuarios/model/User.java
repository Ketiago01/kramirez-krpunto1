package com.ramirez.krusuarios.model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String correo;
	private int edad;

	public User() {
		super();
	}

	public User(Long id, String nombre, String correo, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }
	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }

	@Override
	public int hashCode() { return Objects.hash(id, nombre, correo, edad); }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(correo, other.correo) && edad == other.edad;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + "]";
	}

}
