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
@Table(name = "menu_servicio")
public class MenuServicio {

	@Id
	@GeneratedValue
	@Column(name = "id_menu_servicio")
	private int idMenuServicio;

	@ManyToOne
	@JoinColumn(name = "id_menu")
	private Menus menu;

	@OneToOne
	@JoinColumn(name = "id_servicio")
	private Servicios servicio;

	@Column(name = "cantidad")
	private int cantidad;

	public MenuServicio() {
		
	}

	public MenuServicio(int idMenuServicio, Menus menu, Servicios servicio, int cantidad) {
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

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
		this.menu = menu;
	}

	public Servicios getServicio() {
		return servicio;
	}

	public void setServicio(Servicios servicio) {
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
		return "MenuServicio [idMenuServicio=" + idMenuServicio + ", menu=" + menu + ", servicio=" + servicio
				+ ", cantidad=" + cantidad + "]";
	}

}
