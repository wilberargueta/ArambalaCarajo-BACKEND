package com.arambalacarajo.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.arambalacarajo.entity.Medidas;

public class RecetaProductosModel {

	private int idRecetaProducto;

	private RecetasModel receta;

	private ProductosModel producto;

	private double cantidad;

	@Enumerated(EnumType.STRING)
	private Medidas medida;

	public RecetaProductosModel() {
	}

	public RecetaProductosModel(int idRecetaProducto, RecetasModel receta, ProductosModel producto, double cantidad,
			Medidas medida) {
		super();
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

	public Medidas getMedida() {
		return medida;
	}

	public void setMedida(Medidas medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "RecetaProductosModel [idRecetaProducto=" + idRecetaProducto + ", receta=" + receta + ", producto="
				+ producto + ", cantidad=" + cantidad + ", medida=" + medida + "]";
	}

}
