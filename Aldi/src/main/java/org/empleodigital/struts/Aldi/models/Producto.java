package org.empleodigital.struts.Aldi.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "producto")
public class Producto implements Serializable{

	private static final long serialVersionUID = -8216102779181149043L;

	@Id
	@Column(name="id")
	private int id;
	@Column(name = "nombre",nullable=true)
	private String nombre;
	@Column(name = "descripcion",nullable=true)
	private String descripcion;
	@Column(name = "image",nullable=true)
	private String image;
	@Column(name = "nombre_marca",nullable=true)
	private String nombre_marca;
	@Column(name = "peso",nullable=true)
	private double peso;
	@Column(name="precio",nullable=true)
	private double precio;
	@ManyToMany (mappedBy ="productos")
	private List<Pedido> pedidos;
	
	public Producto(String nombre, String descripcion, String image, String nombre_marca, double peso,
			double precio, List<Pedido> pedidos) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.image = image;
		this.nombre_marca = nombre_marca;
		this.peso = peso;
		this.precio = precio;
		this.pedidos = pedidos;
	}
	public Producto() {
		// TODO Auto-generated constructor stub
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getNombre_marca() {
		return nombre_marca;
	}
	public void setNombre_marca(String nombre_marca) {
		this.nombre_marca = nombre_marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
