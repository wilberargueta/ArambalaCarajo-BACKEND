package com.arambalacarajo.model;

import com.arambalacarajo.entity.MedidaProducto;

public class RecetaProductosModel {

	private int idRecetaProducto;

	private RecetasModel receta;

	private ProductosModel producto;

	private double cantidad;
	
	private MedidaProducto medida;
	
	public RecetaProductosModel() {
	}

	public RecetaProductosModel(int idRecetaProducto, RecetasModel receta, ProductosModel producto, double cantidad,
			MedidaProducto medida) {
		this.idRecetaProducto = idRecetaProducto;
		this.receta = receta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.medida = medida;
	}

	public int getIdRecetaProducto() {
		return idRecetaProducto;
	}

	public void setIdRecetaProducto(int idRecetaProducto) {
		this.idRecetaProducto = idRecetaProducto;
	}

	public RecetasModel getReceta() {
		return receta;
	}

	public void setReceta(RecetasModel receta) {
		this.receta = receta;
	}

	public ProductosModel getProducto() {
		return producto;
	}

	public void setProducto(ProductosModel producto) {
		this.producto = producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public MedidaProducto getMedida() {
		return medida;
	}

	public void setMedida(MedidaProducto medida) {
		this.medida = medida;
	}
	

}
