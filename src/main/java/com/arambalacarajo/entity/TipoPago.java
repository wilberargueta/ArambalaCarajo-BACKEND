package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "tipo_pago")
public class TipoPago {

	@Id
	@GeneratedValue
	@Column(name = "id_tipo_pago")
	private int idTipoPago;

	@Column(name = "tipo_pago")
	private String tipoPago;
	
	
	public TipoPago() {
	}


	public TipoPago(int idTipoPago, String tipoPago) {
		this.idTipoPago = idTipoPago;
		this.tipoPago = tipoPago;
	}

	public int getIdTipoPago() {
		return idTipoPago;
	}

	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

}
