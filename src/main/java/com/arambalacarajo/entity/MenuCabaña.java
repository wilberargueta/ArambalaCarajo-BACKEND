package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "menu_cabaña")
public class MenuCabaña {

	@Id
	@GeneratedValue
	@Column(name = "id_cabaña_menu")
	private int idCabañaMenu;

	@OneToOne
	@JoinColumn(name = "cod_cabaña")
	private Cabanas cabaña;

	@OneToOne
	@JoinColumn(name = "id_menu")
	private Menus menu;

	@Column(name = "fecha_inicio")
	private LocalDate fechaInicio;

	@Column(name = "fecha_final")
	private LocalDate fechaFinal;

	public MenuCabaña() {
		// TODO Auto-generated constructor stub
	}

	public MenuCabaña(int idCabañaMenu, Cabanas cabaña, Menus menu, LocalDate fechaInicio, LocalDate fechaFinal) {
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

	public Cabanas getCabaña() {
		return cabaña;
	}

	public void setCabaña(Cabanas cabaña) {
		this.cabaña = cabaña;
	}

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
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
