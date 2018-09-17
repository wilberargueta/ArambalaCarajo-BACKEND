package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria_producto")
public class CategoriaProducto {
	
	@Id
	@GeneratedValue
	@Column(name="id_categoria_producto")
	private int idCategoriaProducto; 
	
	@Column(name="categoriaProducto", nullable=false)
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
