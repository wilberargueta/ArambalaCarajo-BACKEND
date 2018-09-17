package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria_menu")
public class CategoriaMenu {
	@Id
	@GeneratedValue
	@Column(name="id_categoria_menu")
	private int idCategoriaMenu;
	
	@Column(name="categoria_menu", nullable= false)
	private String categoriaMenu;

	public int getIdCategoriaMenu() {
		return idCategoriaMenu;
	}

	public void setIdCategoriaMenu(int idCategoriaMenu) {
		this.idCategoriaMenu = idCategoriaMenu;
	}

	public String getCategoriaMenu() {
		return categoriaMenu;
	}

	public void setCategoriaMenu(String categoriaMenu) {
		this.categoriaMenu = categoriaMenu;
	}

	@Override
	public String toString() {
		return "CategoriaMenu [idCategoriaMenu=" + idCategoriaMenu + ", categoriaMenu=" + categoriaMenu + "]";
	}
	
	

}
