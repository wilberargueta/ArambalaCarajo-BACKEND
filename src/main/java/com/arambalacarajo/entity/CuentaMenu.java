package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_menu")
public class CuentaMenu {

	@Id
	@GeneratedValue
	@Column(name = "id_cuenta_menu")
	private int idCuentaMenu;

	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;

	@ManyToOne
	@JoinColumn(name = "id_menu")
	private Menus menu;

	@Column(name = "cantidad")
	private int cantidad;

	public CuentaMenu() {
		
	}

	public CuentaMenu(int idCuentaMenu, Cuenta cuenta, Menus menu, int cantidad) {
		this.idCuentaMenu = idCuentaMenu;
		this.cuenta = cuenta;
		this.menu = menu;
		this.cantidad = cantidad;
	}

	public int getIdCuentaMenu() {
		return idCuentaMenu;
	}

	public void setIdCuentaMenu(int idCuentaMenu) {
		this.idCuentaMenu = idCuentaMenu;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Menus getMenu() {
		return menu;
	}

	public void setMenu(Menus menu) {
		this.menu = menu;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "CuentaMenu [idCuentaMenu=" + idCuentaMenu + ", cuenta=" + cuenta + ", menu=" + menu + ", cantidad="
				+ cantidad + "]";
	}

}
