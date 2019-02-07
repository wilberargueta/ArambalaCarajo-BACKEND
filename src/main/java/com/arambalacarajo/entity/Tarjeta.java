package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarjeta")
public class Tarjeta {
	
	@Id
	@GeneratedValue
	@Column(name="id_tarjeta")
	private int idTarjeta;
	
	@Column(name="numero_tarjeta")
	private String numeroTarjeta;
	
	@Column(name="nombre_propietario")
	private String nombrePropietario;
	
	@Column(name="codigoConfirmacion")
	private String codigoConfirmacion;

	public Tarjeta() {
	}

	public Tarjeta(int idTarjeta, String numeroTarjeta, String nombrePropietario, String codigoConfirmacion) {
		this.idTarjeta = idTarjeta;
		this.numeroTarjeta = numeroTarjeta;
		this.nombrePropietario = nombrePropietario;
		this.codigoConfirmacion = codigoConfirmacion;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getCodigoConfirmacion() {
		return codigoConfirmacion;
	}

	public void setCodigoConfirmacion(String codigoConfirmacion) {
		this.codigoConfirmacion = codigoConfirmacion;
	}
	
	

}
