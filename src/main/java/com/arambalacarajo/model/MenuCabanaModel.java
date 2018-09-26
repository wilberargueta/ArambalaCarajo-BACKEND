package com.arambalacarajo.model;

import java.time.LocalDate;

public class MenuCabanaModel {

	private int idCabanaMenu;

	private CabanasModel cabana;

	private MenusModel menu;

	private LocalDate fechaInicio;

	private LocalDate fechaFinal;

	public MenuCabanaModel() {
		// TODO Auto-generated constructor stub
	}

	public MenuCabanaModel(int idCabanaMenu, CabanasModel cabana, MenusModel menu, LocalDate fechaInicio,
			LocalDate fechaFinal) {
		this.idCabanaMenu = idCabanaMenu;
		this.cabana = cabana;
		this.menu = menu;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}

	public int getIdCabanaMenu() {
		return idCabanaMenu;
	}

	public void setIdCabanaMenu(int idCabanaMenu) {
		this.idCabanaMenu = idCabanaMenu;
	}

	public CabanasModel getCabana() {
		return cabana;
	}

	public void setCabana(CabanasModel cabana) {
		this.cabana = cabana;
	}

	public MenusModel getMenu() {
		return menu;
	}

	public void setMenu(MenusModel menu) {
		this.menu = menu;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	@Override
	public String toString() {
		return "MenuCabana [idCabanaMenu=" + idCabanaMenu + ", cabana=" + cabana + ", menu=" + menu + ", fechaInicio="
				+ fechaInicio + ", fechaFinal=" + fechaFinal + "]";
	}

}
