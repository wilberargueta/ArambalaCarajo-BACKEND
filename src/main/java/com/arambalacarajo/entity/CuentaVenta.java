package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name = "cuenta_venta")
public class CuentaVenta {

	@Id
	@GeneratedValue
	@Column(name = "id_cuenta_venta")
	private int idCuentaVenta;

	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;

	@ManyToOne
	@JoinColumn(name = "id_venta")
	private Ventas venta;

	public CuentaVenta() {
		// TODO Auto-generated constructor stub
	}

	public CuentaVenta(int idCuentaVenta, Cuenta cuenta, Ventas venta) {
		this.idCuentaVenta = idCuentaVenta;
		this.cuenta = cuenta;
		this.venta = venta;
	}

	public int getIdCuentaVenta() {
		return idCuentaVenta;
	}

	public void setIdCuentaVenta(int idCuentaVenta) {
		this.idCuentaVenta = idCuentaVenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}
	
	

}
