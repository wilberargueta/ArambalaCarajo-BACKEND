package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "caja")
public class Caja {

	@Id
	@GeneratedValue
	@Column(name = "id_caja")
	private int idCaja;

	@Column(name = "apertura_caja")
	private LocalDate aperturaCaja;

	@Column(name = "cierre_caja", nullable = true)
	private LocalDate cierreCaja;

	@Column(name = "monto_apertura")
	private String montoApertura;

	@Column(name = "monto_cierre", nullable = true)
	private String montoCierre;

	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column(name = "caja_cerrada")
	private boolean cajaCerrada;

	public Caja() {
		// TODO Auto-generated constructor stub
	}

	public Caja(int idCaja, LocalDate aperturaCaja, LocalDate cierreCaja, String montoApertura, String montoCierre,
			Usuario usuario, boolean cajaCerrada) {
		this.idCaja = idCaja;
		this.aperturaCaja = aperturaCaja;
		this.cierreCaja = cierreCaja;
		this.montoApertura = montoApertura;
		this.montoCierre = montoCierre;
		this.usuario = usuario;
		this.cajaCerrada = cajaCerrada;
	}

	public int getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(int idCaja) {
		this.idCaja = idCaja;
	}

	public LocalDate getAperturaCaja() {
		return aperturaCaja;
	}

	public void setAperturaCaja(LocalDate aperturaCaja) {
		this.aperturaCaja = aperturaCaja;
	}

	public LocalDate getCierreCaja() {
		return cierreCaja;
	}

	public void setCierreCaja(LocalDate cierreCaja) {
		this.cierreCaja = cierreCaja;
	}

	public String getMontoApertura() {
		return montoApertura;
	}

	public void setMontoApertura(String montoApertura) {
		this.montoApertura = montoApertura;
	}

	public String getMontoCierre() {
		return montoCierre;
	}

	public void setMontoCierre(String montoCierre) {
		this.montoCierre = montoCierre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isCajaCerrada() {
		return cajaCerrada;
	}

	public void setCajaCerrada(boolean cajaCerrada) {
		this.cajaCerrada = cajaCerrada;
	}

	

}
