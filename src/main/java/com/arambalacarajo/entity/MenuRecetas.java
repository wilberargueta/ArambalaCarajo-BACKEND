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
@Table(name = "menu_recetas")
public class MenuRecetas {

	@Id
	@GeneratedValue
	@Column(name = "id_menu_receta")
	private int idMenuReceta;

	@OneToOne
	@JoinColumn(name = "id_receta",nullable=false)
	private Recetas receta;

	@ManyToOne
	@JoinColumn(name = "id_menu",nullable=false)
	private Menus menu;

	public MenuRecetas() {
		
	}

	public MenuRecetas(int idMenuReceta, Recetas receta, Menus menu) {
		this.idMenuReceta = idMenuReceta;
		this.receta = receta;
		this.menu = menu;
	}

	public int getIdMenuReceta() {
		return idMenuReceta;
	}

	public void setIdMenuReceta(int idMenuReceta) {
		this.idMenuReceta = idMenuReceta;
	}

	public Recetas getReceta() {
		return receta;
	}

	public void setReceta(Recetas receta) {
		this.receta = receta;
	}

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "MenuRecetas [idMenuReceta=" + idMenuReceta + ", receta=" + receta + ", menu=" + menu + "]";
	}

}
