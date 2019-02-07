package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicios {

	@Id
	@GeneratedValue
	@Column(name = "id_servicio")
	private int idServicio;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private String precio;

	@Column(name = "detalle", nullable = true)
	private String detalle;

	public Servicios() {
		
	}

	public Servicios(int idServicio, String nombre, String precio, String detalle) {
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
