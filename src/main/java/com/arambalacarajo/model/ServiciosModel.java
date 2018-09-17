package com.arambalacarajo.model;

public class ServiciosModel {

	private int idServicio;

	private String nombre;

	private String precio;

	private String detalle;

	public ServiciosModel() {
		// TODO Auto-generated constructor stub
	}

	public ServiciosModel(int idServicio, String nombre, String precio, String detalle) {
		this.idServicio = idServicio;
		this.nombre = nombre;
		this.precio = precio;
		this.detalle = detalle;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Servicios [idServicio=" + idServicio + ", nombre=" + nombre + ", precio=" + precio + ", detalle="
				+ detalle + "]";
	}

}
