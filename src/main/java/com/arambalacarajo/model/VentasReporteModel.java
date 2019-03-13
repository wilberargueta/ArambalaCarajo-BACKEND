package com.arambalacarajo.model;

import java.time.LocalDate;

public class VentasReporteModel {

	private LocalDate fecha;
	private String producto;
	private int cantidad;
	private double totalConIva;
	private double totalSinIva;
	private double totalIva;

	public VentasReporteModel() {

	}

	public VentasReporteModel(LocalDate fecha, String producto, int cantidad, double totalConIva, double totalSinIva,
			double totalIva) {
		this.fecha = fecha;
		this.producto = producto;
		this.cantidad = cantidad;
		this.totalConIva = totalConIva;
		this.totalSinIva = totalSinIva;
		this.totalIva = totalIva;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotalConIva() {
		return totalConIva;
	}

	public void setTotalConIva(double totalConIva) {
		this.totalConIva = totalConIva;
	}

	public double getTotalSinIva() {
		return totalSinIva;
	}

	public void setTotalSinIva(double totalSinIva) {
		this.totalSinIva = totalSinIva;
	}

	public double getTotalIva() {
		return totalIva;
	}

	public void setTotalIva(double totalIva) {
		this.totalIva = totalIva;
	}

	@Override
	public String toString() {
		return "VentasReporteModel [fecha=" + fecha + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", totalConIva=" + totalConIva + ", totalSinIva=" + totalSinIva + ", totalIva=" + totalIva + "]";
	}

}
