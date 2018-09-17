package com.arambalacarajo.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cabanas")
public class Cabanas {
	@Id
	@Column(name = "cod_cabana")
	private char[] codCabana;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private String precio;

	@Column(name = "disponible")
	private boolean disponible;

	@Column(name = "detalle")
	private String detalle;

	public Cabanas() {
		// TODO Auto-generated constructor stub
	}

	public Cabanas(char[] codCabana, String nombre, String precio, boolean disponible, String detalle) {
		this.codCabana = codCabana;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
		this.detalle = detalle;
	}

	public char[] getCodCabaña() {
		return codCabana;
	}

	public void setCodCabaña(char[] codCabaña) {
		this.codCabana = codCabaña;
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
