package com.arambalacarajo.model;

public class CompraProductosModel {

	private int idCompraProducto;

	private ComprasModel compras;

	private ProductosModel productos;

	private int cantidad;

	public CompraProductosModel() {
		// TODO Auto-generated constructor stub
	}

	public CompraProductosModel(int idCompraProducto, ComprasModel compras, ProductosModel productos, int cantidad) {
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

	public ProductosModel getProductos() {
		return productos;
	}

	public void setProductos(ProductosModel productos) {
		this.productos = productos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ComprasModel getCompras() {
		return compras;
	}

	public void setCompras(ComprasModel compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "CompraProductos [idCompraProducto=" + idCompraProducto + ", compras=" + compras + ", productos="
				+ productos + ", cantidad=" + cantidad + "]";
	}

}
