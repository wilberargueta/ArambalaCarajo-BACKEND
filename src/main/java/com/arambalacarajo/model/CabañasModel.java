package com.arambalacarajo.model;

import java.util.Arrays;

public class CabañasModel {

	private char[] codCabana;

	private String nombre;

	private String precio;

	private boolean disponible;
	//
	private String detalle;

	public CabañasModel() {
		// TODO Auto-generated constructor stub
	}

	public CabañasModel(char[] codCabana, String nombre, String precio, boolean disponible, String detalle) {
		this.codCabana = codCabana;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
		this.detalle = detalle;
	}

	public char[] getCodCabana() {
		return codCabana;
	}

	public void setCodCabana(char[] codCabana) {
		this.codCabana = codCabana;
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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Cabañas [cod_cabaña=" + Arrays.toString(codCabana) + ", nombre=" + nombre + ", precio=" + precio
				+ ", disponible=" + disponible + ", detalle=" + detalle + "]";
	}

}
