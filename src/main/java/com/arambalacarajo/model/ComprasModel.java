package com.arambalacarajo.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ComprasModel {

	private int idCompra;

	private char[] registroCompra;

	private LocalDate fechaCompra;

	private String detalle;

	private ProveedoresModel proveedor;

	private List<CompraProductosModel> compraProducto;

	public ComprasModel() {
		// TODO Auto-generated constructor stub
	}

	public ComprasModel(int idCompra, char[] registroCompra, LocalDate fechaCompra, String detalle, ProveedoresModel proveedor) {
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

	public ProveedoresModel getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedoresModel proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Compras [idCompra=" + idCompra + ", registroCompra=" + Arrays.toString(registroCompra)
				+ ", fechaCompra=" + fechaCompra + ", detalle=" + detalle + ", proveedor=" + proveedor
				+ ", compraProducto=" + compraProducto + "]";
	}

}
