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
@Table(name = "caja_venta")
public class CajaVenta {

	@Id
	@GeneratedValue
	@Column(name = "id_caja_venta")
	private int idCajaVenta;

	@OneToOne
	@JoinColumn(name = "registro_venta")
	private Ventas venta;

	@OneToOne
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;

	@ManyToOne
	@JoinColumn(name = "id_caja")
	private Caja caja;

	public CajaVenta() {

	}

	public CajaVenta(int idCajaVenta, Ventas venta, Cuenta cuenta, Caja caja) {
		this.idCajaVenta = idCajaVenta;
		this.venta = venta;
		this.cuenta = cuenta;
		this.caja = caja;
	}

	public int getIdCajaVenta() {
		return idCajaVenta;
	}

	public void setIdCajaVenta(int idCajaVenta) {
		this.idCajaVenta = idCajaVenta;
	}

	public Ventas getVenta() { 
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	@Override
	public String toString() {
		return "CajaVenta [idCajaVenta=" + idCajaVenta + ", venta=" + venta + ", cuenta=" + cuenta + ", caja=" + caja
				+ "]";
	}
	

}
