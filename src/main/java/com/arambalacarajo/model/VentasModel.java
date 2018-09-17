package com.arambalacarajo.model;

import java.time.LocalDate;
import java.util.Arrays;

public class VentasModel {

	private int idVenta;

	private char[] numRegistro;

	private LocalDate fecha;

	private String detalle;

	public VentasModel() {
		// TODO Auto-generated constructor stub
	}

	public VentasModel(int idVenta, char[] numRegistro, LocalDate fecha, String detalle) {
		this.idVenta = idVenta;
		this.numRegistro = numRegistro;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public char[] getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(char[] numRegistro) {
		this.numRegistro = numRegistro;
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

	@Override
	public String toString() {
		return "Ventas [idVenta=" + idVenta + ", numRegistro=" + Arrays.toString(numRegistro) + ", fecha=" + fecha
				+ ", detalle=" + detalle + "]";
	}

}
