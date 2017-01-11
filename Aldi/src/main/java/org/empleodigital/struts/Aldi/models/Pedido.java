package org.empleodigital.struts.Aldi.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import freemarker.template.utility.DateUtil;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@Column(name = "id", unique = true)
	private int id;
	@Column(name = "fecha_pedido", nullable = false)
	private DateUtil fecha_pedido;
	@Column(name = "confirmado", nullable = false)
	private int confirmado;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@ManyToMany(mappedBy = "pedidos")
	private List<Producto> productos;
	
	public Pedido(DateUtil fecha_pedido, int confirmado, Cliente cliente, List<Producto> productos) {
		this.fecha_pedido = fecha_pedido;
		this.confirmado = confirmado;
		this.cliente = cliente;
		this.productos = productos;
	}

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateUtil getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(DateUtil fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public int getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(int confirmado) {
		this.confirmado = confirmado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	
}
