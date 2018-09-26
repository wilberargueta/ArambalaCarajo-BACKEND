package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue
	@Column(name = "id_categoria")
	private int idCategoria;

	@Column(name = "categoria", nullable = false)
	private String categoria;
	
	@Column(name = "cod_categoria", nullable = false)
	private String codCategoria;

	public Categoria() {
	}

	public Categoria(int idCategoria, String categoria) {

		this.idCategoria = idCategoria;
		this.categoria = categoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(String codCategoria) {
		this.codCategoria = codCategoria;
	}
	

}
