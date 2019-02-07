package com.arambalacarajo.model;



public class CabanasModel {

	private String codCabana;

	private String nombre;

	private String precio;

	private boolean disponible;
	//
	private String detalle;

	public CabanasModel() {
		
	}

	public CabanasModel(String codCabana, String nombre, String precio, boolean disponible, String detalle) {
		this.codCabana = codCabana;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
		this.detalle = detalle;
	}

	public String getCodCabana() {
		return codCabana;
	}

	public void setCodCabana(String codCabana) {
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

}
