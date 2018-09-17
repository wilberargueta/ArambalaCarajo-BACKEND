package com.arambalacarajo.model;


public class ProductoCategoriaProductoModel {

	private int idProductoCategoriaProducto;

	private CategoriaProductoModel categoriaProducto;

	private ProductosModel producto;

	public int getIdProductoCategoriaProducto() {
		return idProductoCategoriaProducto;
	}

	public void setIdProductoCategoriaProducto(int idProductoCategoriaProducto) {
		this.idProductoCategoriaProducto = idProductoCategoriaProducto;
	}

	public CategoriaProductoModel getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(CategoriaProductoModel categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public ProductosModel getProducto() {
		return producto;
	}

	public void setProducto(ProductosModel producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "ProductoCategoriaProducto [idProductoCategoriaProducto=" + idProductoCategoriaProducto
				+ ", categoriaProducto=" + categoriaProducto + ", producto=" + producto + "]";
	}

}
