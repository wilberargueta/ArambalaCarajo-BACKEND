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
@Table(name = "menu_cabana")
public class MenuCabana {

	@Id
	@GeneratedValue
	@Column(name = "id_cabana_menu")
	private int idCabanaMenu;

	@OneToOne
	@JoinColumn(name = "cod_cabana")
	private Cabanas cabana;

	@OneToOne
	@JoinColumn(name = "id_menu")
	private Menus menu;

	@Column(name = "fecha_inicio")
	private LocalDate fechaInicio;

	@Column(name = "fecha_final")
	private LocalDate fechaFinal;

	public MenuCabana() {
	
	}

	public MenuCabana(int idCabanaMenu, Cabanas cabana, Menus menu, LocalDate fechaInicio, LocalDate fechaFinal) {
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

	public Cabanas getCabana() {
		return cabana;
	}

	public void setCabana(Cabanas cabana) {
		this.cabana = cabana;
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
		return "MenuCabaña [idCabanaMenu=" + idCabanaMenu + ", cabana=" + cabana + ", menu=" + menu + ", fechaInicio="
				+ fechaInicio + ", fechaFinal=" + fechaFinal + "]";
	}

}
