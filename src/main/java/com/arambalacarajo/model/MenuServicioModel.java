package com.arambalacarajo.model;

public class MenuServicioModel {

	private int idMenuServicio;
	private MenusModel menu;
	private ServiciosModel servicio;
	private int cantidad;

	public MenuServicioModel() {
		// TODO Auto-generated constructor stub
	}

	public MenuServicioModel(int idMenuServicio, MenusModel menu, ServiciosModel servicio, int cantidad) {
		this.idMenuServicio = idMenuServicio;
		this.menu = menu;
		this.servicio = servicio;
		this.cantidad = cantidad;
	}

	public int getIdMenuServicio() {
		return idMenuServicio;
	}

	public void setIdMenuServicio(int idMenuServicio) {
		this.idMenuServicio = idMenuServicio;
	}

	public MenusModel getMenu() {
		return menu;
	}

	public void setMenu(MenusModel menu) {
		this.menu = menu;
	}

	public ServiciosModel getServicio() {
		return servicio;
	}

	public void setServicio(ServiciosModel servicio) {
		this.servicio = servicio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "MenuServicioModel [idMenuServicio=" + idMenuServicio + ", menu=" + menu + ", servicio=" + servicio
				+ ", cantidad=" + cantidad + "]";
	}

}
