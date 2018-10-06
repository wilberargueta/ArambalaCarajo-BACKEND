package com.arambalacarajo.model;

import com.arambalacarajo.entity.Usuario;

public class CajaMultiValues {

	private Usuario usuario;
	private String aperturaCaja;

	public CajaMultiValues() {

	}

	public CajaMultiValues(Usuario usuario, String aperturaCaja) {
		this.usuario = usuario;
		this.aperturaCaja = aperturaCaja;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getAperturaCaja() {
		return aperturaCaja;
	}

	public void setAperturaCaja(String aperturaCaja) {
		this.aperturaCaja = aperturaCaja;
	}

}
