package com.arambalacarajo.model;

public class ExistenciasModel {

	private int idExistencias;

	private int cantidad;

	private ProductosModel productos;

	public ExistenciasModel() {

	}

	public ExistenciasModel(int idExistencias, int cantidad) {
		this.idExistencias = idExistencias;
		this.cantidad = cantidad;

	}

	public int getIdExistencias() {
		return idExistencias;
	}

	public void setIdExistencias(int idExistencias) {
		this.idExistencias = idExistencias;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ProductosModel getProductos() {
		return productos;
	}

	public void setProductos(ProductosModel productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Existencias [idExistencias=" + idExistencias + ", cantidad=" + cantidad + ", codProducto="
				+ ", productos=" + productos + "]";
	}

}
