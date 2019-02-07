package com.arambalacarajo.model;

public class ExistenciasModel {

	private int idExistencias;

	private double cantidad;

	private ProductosModel productos;

	public ExistenciasModel() {

	}

	public ExistenciasModel(int idExistencias, double cantidad, ProductosModel productos) {
		this.idExistencias = idExistencias;
		this.cantidad = cantidad;
		this.productos = productos;
	}

	public int getIdExistencias() {
		return idExistencias;
	}

	public void setIdExistencias(int idExistencias) {
		this.idExistencias = idExistencias;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public ProductosModel getProductos() {
		return productos;
	}

	public void setProductos(ProductosModel productos) {
		this.productos = productos;
	}



}
