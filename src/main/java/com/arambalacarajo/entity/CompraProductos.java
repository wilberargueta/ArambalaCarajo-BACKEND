package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra_productos")
public class CompraProductos {

	@Id
	@Column(name = "id_compra_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompraProducto;

	@ManyToOne
	@JoinColumn(name = "registro_compra")
	private Compras compras;

	@OneToOne
	@JoinColumn(name = "cod_producto")
	private Productos productos;

	@Column(name = "cantidad")
	private int cantidad;

	public CompraProductos() {
		// TODO Auto-generated constructor stub
	}

	public CompraProductos(int idCompraProducto, Compras compras, Productos productos, int cantidad) {
		this.idCompraProducto = idCompraProducto;
		this.compras = compras;
		this.productos = productos;
		this.cantidad = cantidad;
	}

	public int getIdCompraProducto() {
		return idCompraProducto;
	}

	public void setIdCompraProducto(int idCompraProducto) {
		this.idCompraProducto = idCompraProducto;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "CompraProductos [idCompraProducto=" + idCompraProducto + ", compras=" + compras + ", productos="
				+ productos + ", cantidad=" + cantidad + "]";
	}

}
