package com.arambalacarajo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.arambalacarajo.component.CuentaDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "cuenta_usuario")
public class CuentaUsuario {

	@Id
	@GeneratedValue
	@Column(name = "id_cuenta_usuario")
	private int idCuentaUsuario;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	@JsonDeserialize(using = CuentaDeserializer.class)
	private Cuenta cuenta;

	public CuentaUsuario() {

	}

	public CuentaUsuario(int idCuentaUsuario, Usuario usuario, Cuenta cuenta) {
		this.idCuentaUsuario = idCuentaUsuario;
		this.usuario = usuario;
		this.cuenta = cuenta;
	}

	public int getIdCuentaUsuario() {
		return idCuentaUsuario;
	}

	public void setIdCuentaUsuario(int idCuentaUsuario) {
		this.idCuentaUsuario = idCuentaUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "CuentaUsuario [idCuentaUsuario=" + idCuentaUsuario + ", usuario=" + usuario + ", cuenta=" + cuenta
				+ "]";
	}

}
