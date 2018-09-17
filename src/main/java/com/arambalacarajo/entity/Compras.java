package com.arambalacarajo.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compras {

	@Id
	@Column(name = "id_compra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompra;

	@Column(name = "registro_compra", unique = true)
	private char[] registroCompra;

	@Column(name = "fecha_compra")
	private LocalDate fechaCompra;

	@Column(name = "detalle")
	private String detalle;

	@ManyToOne
	@JoinColumn(name = "cod_proveedor")
	private Proveedores proveedor;

	@OneToMany(mappedBy = "compras")
	private List<CompraProductos> compraProducto;

	public Compras() {
		// TODO Auto-generated constructor stub
	}

	public Compras(int idCompra, char[] registroCompra, LocalDate fechaCompra, String detalle, Proveedores proveedor) {
		this.idCompra = idCompra;
		this.registroCompra = registroCompra;
		this.fechaCompra = fechaCompra;
		this.detalle = detalle;
		this.proveedor = proveedor;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public char[] getRegistroCompra() {
		return registroCompra;
	}

	public void setRegistroCompra(char[] registroCompra) {
		this.registroCompra = registroCompra;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Compras [idCompra=" + idCompra + ", registroCompra=" + Arrays.toString(registroCompra)
				+ ", fechaCompra=" + fechaCompra + ", detalle=" + detalle + ", proveedor=" + proveedor + "]";
	}

}
