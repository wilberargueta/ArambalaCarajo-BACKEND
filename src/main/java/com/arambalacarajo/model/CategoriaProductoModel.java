package com.arambalacarajo.model;


public class CategoriaProductoModel {
	

	private int idCategoriaProducto; 
	

	private String categoriaProducto;

	public int getIdCategoriaProducto() {
		return idCategoriaProducto;
	}

	public void setIdCategoriaProducto(int idCategoriaProducto) {
		this.idCategoriaProducto = idCategoriaProducto;
	}

	public String getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	@Override
	public String toString() {
		return "CategoriaProducto [idCategoriaProducto=" + idCategoriaProducto + ", categoriaProducto="
				+ categoriaProducto + "]";
	}
	
}
