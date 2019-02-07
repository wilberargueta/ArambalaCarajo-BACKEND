package com.arambalacarajo.model;

import java.time.LocalDate;

public class VentasModel {

	private int idVenta;

	private String registroVenta;

	private LocalDate fecha;

	private String detalle;

	public VentasModel() {
		
	}

	public VentasModel(int idVenta, String registroVenta, LocalDate fecha, String detalle) {
		this.idVenta = idVenta;
		this.registroVenta = registroVenta;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public String getRegistroVenta() {
		return registroVenta;
	}

	public void setRegistroVenta(String registroVenta) {
		this.registroVenta = registroVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
