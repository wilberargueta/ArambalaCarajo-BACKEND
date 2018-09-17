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
@Table(name = "venta_menus")
public class VentaMenus {

	@Id
	@GeneratedValue
	@Column(name = "id_venta_menu")
	private int idVentaMenu;

	@OneToOne
	@JoinColumn(name = "id_menu", nullable = false)
	private Menus menu;

	@ManyToOne
	@JoinColumn(name = "id_venta", nullable = false)
	private Ventas venta;

	@Column(name = "cantidad", nullable = false)
	private int cantidad = 1;

	public VentaMenus() {
		// TODO Auto-generated constructor stub
	}

	public VentaMenus(int idVentaMenu, Menus menu, Ventas venta, int cantidad) {
		this.idVentaMenu = idVentaMenu;
		this.menu = menu;
		this.venta = venta;
		this.cantidad = cantidad;
	}

	public int getIdVentaMenu() {
		return idVentaMenu;
	}

	public void setIdVentaMenu(int idVentaMenu) {
		this.idVentaMenu = idVentaMenu;
	}

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
		this.menu = menu;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "VentaMenus [idVentaMenu=" + idVentaMenu + ", menu=" + menu + ", venta=" + venta + ", cantidad="
				+ cantidad + "]";
	}

}
