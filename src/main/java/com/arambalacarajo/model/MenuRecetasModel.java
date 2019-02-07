package com.arambalacarajo.model;

public class MenuRecetasModel {

	private int idMenuReceta;

	private RecetasModel receta;

	private MenusModel menu;

	public MenuRecetasModel() {

	}

	public MenuRecetasModel(int idMenuReceta, RecetasModel receta, MenusModel menu) {
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

	public RecetasModel getReceta() {
		return receta;
	}

	public void setReceta(RecetasModel receta) {
		this.receta = receta;
	}

	public MenusModel getMenu() {
		return menu;
	}

	public void setMenu(MenusModel menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "MenuRecetas [idMenuReceta=" + idMenuReceta + ", receta=" + receta + ", menu=" + menu + "]";
	}

}
