package com.arambalacarajo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cuenta_usuario")
public class CuentaUsuario {
	
	@Id
	@GeneratedValue
	@Column(name="id_cuenta_usuario")
	private int idCuentaUsuario;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_cuenta")
	private Cuenta cuenta;

	public CuentaUsuario() {
		// TODO Auto-generated constructor stub
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
	
	

}
