package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_comprobante")
public class TipoComprobante {

	@Id
	@GeneratedValue
	@Column(name = "id_tipo_comprobante")
	private int idTipoComprobante;

	@Column(name = "tipo_comprobante")
	private String tipoComprobante;

	public TipoComprobante() {

	}

	public TipoComprobante(int idTipoComprobante, String tipoComprobante) {
		this.idTipoComprobante = idTipoComprobante;
		this.tipoComprobante = tipoComprobante;
	}

	public int getIdTipoComprobante() {
		return idTipoComprobante;
	}

	public void setIdTipoComprobante(int idTipoComprobante) {
		this.idTipoComprobante = idTipoComprobante;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	@Override
	public String toString() {
		return "TipoComprobante [idTipoComprobante=" + idTipoComprobante + ", tipoComprobante=" + tipoComprobante + "]";
	}

}