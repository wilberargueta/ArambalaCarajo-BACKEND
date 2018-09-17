package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto_categoria_producto")
public class ProductoCategoriaProducto {

	@Id
	@GeneratedValue
	@Column(name = "id_producto_categoria_producto")
	private int idProductoCategoriaProducto;

	@ManyToOne
	@JoinColumn(name = "id_categoria_producto")
	private CategoriaProducto categoriaProducto;

	@OneToOne
	@JoinColumn(name = "cod_producto")
	private Productos producto;

	public int getIdProductoCategoriaProducto() {
		return idProductoCategoriaProducto;
	}

	public void setIdProductoCategoriaProducto(int idProductoCategoriaProducto) {
		this.idProductoCategoriaProducto = idProductoCategoriaProducto;
	}

	public CategoriaProducto getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "ProductoCategoriaProducto [idProductoCategoriaProducto=" + idProductoCategoriaProducto
				+ ", categoriaProducto=" + categoriaProducto + ", producto=" + producto + "]";
	}

}
