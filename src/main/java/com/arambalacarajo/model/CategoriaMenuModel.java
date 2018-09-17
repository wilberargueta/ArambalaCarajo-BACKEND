package com.arambalacarajo.model;


public class CategoriaMenuModel {

	private int idCategoriaMenu;
	

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
