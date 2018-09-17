package com.arambalacarajo.model;

public class RecetaProductosModel {

	private int idRecetaProducto;

	private RecetasModel receta;

	private ProductosModel producto;

	private int cantidad;

	public RecetaProductosModel() {
	}

	public RecetaProductosModel(int idRecetaProducto, RecetasModel receta, ProductosModel producto, int cantidad) {
		this.idRecetaProducto = idRecetaProducto;
		this.receta = receta;
		this.producto = producto;
		this.cantidad = cantidad;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "RecetaProductos [idRecetaProducto=" + idRecetaProducto + ", receta=" + receta + ", producto=" + producto
				+ ", cantidad=" + cantidad + "]";
	}

}
