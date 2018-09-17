package com.arambalacarajo.model;

import java.time.LocalDate;

public class MenuCabañaModel {

	private int idCabañaMenu;

	private CabañasModel cabaña;

	private MenusModel menu;

	private LocalDate fechaInicio;

	private LocalDate fechaFinal;

	public MenuCabañaModel() {
		// TODO Auto-generated constructor stub
	}

	public MenuCabañaModel(int idCabañaMenu, CabañasModel cabaña, MenusModel menu, LocalDate fechaInicio,
			LocalDate fechaFinal) {
		this.idCabañaMenu = idCabañaMenu;
		this.cabaña = cabaña;
		this.menu = menu;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}

	public int getIdCabañaMenu() {
		return idCabañaMenu;
	}

	public void setIdCabañaMenu(int idCabañaMenu) {
		this.idCabañaMenu = idCabañaMenu;
	}

	public CabañasModel getCabaña() {
		return cabaña;
	}

	public void setCabaña(CabañasModel cabaña) {
		this.cabaña = cabaña;
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
		return "MenuCabaña [idCabañaMenu=" + idCabañaMenu + ", cabaña=" + cabaña + ", menu=" + menu + ", fechaInicio="
				+ fechaInicio + ", fechaFinal=" + fechaFinal + "]";
	}

}
