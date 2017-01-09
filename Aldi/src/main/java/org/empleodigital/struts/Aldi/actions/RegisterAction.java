package org.empleodigital.struts.Aldi.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.empleodigital.struts.Aldi.db.GestorUsuarios;

import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction extends ActionSupport {

	private String nombre,apellido1,apellido2,direccion,email,user,pass,message;
	private int telefono;
	
	public String execute() throws Exception{
		try{
		GestorUsuarios.create(nombre,apellido1,apellido2,direccion,email,telefono,user,pass);
		}catch(Exception e){
			setMessage("Algo ha fallado, por favor, intentelo de nuevo");
			return ERROR;
		}
		setMessage("Se ha registrado satisfactoriamente");
		return SUCCESS;		
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
