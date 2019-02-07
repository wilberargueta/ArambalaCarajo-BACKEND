package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta_tarjeta")
public class VentaTarjeta {

	@Id
	@GeneratedValue
	@Column(name = "id_venta_tarjeta")
	private int idVentaTarjeta;

	@ManyToOne
	@JoinColumn(name = "id_venta")
	private Ventas venta;

	@ManyToOne
	@JoinColumn(name = "cod_tarjeta")
	private Tarjeta tarjeta;

	public VentaTarjeta() {
	}

	public VentaTarjeta(int idVentaTarjeta, Ventas venta, Tarjeta tarjeta) {
		this.idVentaTarjeta = idVentaTarjeta;
		this.venta = venta;
		this.tarjeta = tarjeta;
	}

	public int getIdVentaTarjeta() {
		return idVentaTarjeta;
	}

	public void setIdVentaTarjeta(int idVentaTarjeta) {
		this.idVentaTarjeta = idVentaTarjeta;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

}
