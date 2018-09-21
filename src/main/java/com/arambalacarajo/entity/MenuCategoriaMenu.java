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
@Table(name="menu_categoria_menu")
public class MenuCategoriaMenu {
	
	@Id
	@GeneratedValue
	@Column(name="id_menu_categoria_menu")
	private int idMenuCategoriaMenu;
	
	@OneToOne
	@JoinColumn(name="id_categoria_menu", nullable =false)
	private CategoriaMenu categoriaMenu;
	
	@OneToOne
	@JoinColumn(name="id_menu", nullable= false)
	private Menus menu;

	public int getIdMenuCategoriaMenu() {
		return idMenuCategoriaMenu;
	}

	public void setIdMenuCategoriaMenu(int idMenuCategoriaMenu) {
		this.idMenuCategoriaMenu = idMenuCategoriaMenu;
	}

	public CategoriaMenu getCategoriaMenu() {
		return categoriaMenu;
	}

	public void setCategoriaMenu(CategoriaMenu categoriaMenu) {
		this.categoriaMenu = categoriaMenu;
	}

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
		this.menu = menu;
	}

	
	

}
