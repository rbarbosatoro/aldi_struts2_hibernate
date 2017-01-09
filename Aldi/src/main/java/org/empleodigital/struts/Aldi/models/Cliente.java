package org.empleodigital.struts.Aldi.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 4440358923452332544L;
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name = "nombre",nullable=true)
	private String nombre;
	@Column(name = "apellido1",nullable=true)
	private String apellido1;
	@Column(name = "apellido2",nullable=true)
	private String apellido2;
	@Column(name = "direccion",nullable=true)
	private String direccion;
	@Column(name = "telefono",nullable=true)
	private int telefono;
	@Column(name = "email",nullable=true)
	private String email;
	@Column(name = "usuario",nullable=false)
	private String usuario;
	@Column(name = "password",nullable=false)
	private String password;
	
	
	public Cliente() {
	
	}
	
	public Cliente(String nombre, String apellido1, String apellido2, String direccion,
			String email,int telefono, String usuario, String password) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.usuario = usuario;
		this.password = password;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
