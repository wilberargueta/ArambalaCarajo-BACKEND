package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="menu_categoria")
public class MenuCategoria {
	
	@Id
	@GeneratedValue
	@Column(name="id_menu_categoria")
	private int idMenuCategoria;
	
	@ManyToOne
	@JoinColumn(name="id_menu")
	private Menus menu;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;

	public int getIdMenuCategoria() {
		return idMenuCategoria;
	}

	public void setIdMenuCategoria(int idMenuCategoria) {
		this.idMenuCategoria = idMenuCategoria;
	}

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
		this.menu = menu;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
