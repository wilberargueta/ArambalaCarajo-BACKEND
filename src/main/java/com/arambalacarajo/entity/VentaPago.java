package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name="venta_pago")
public class VentaPago {
	
	@Id
	@GeneratedValue
	@Column(name="id_venta_pago")
	private int idVentaPago;
	
	@ManyToOne
	@JoinColumn(name="id_venta")
	private Ventas venta;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_pago")
	private TipoPago tipoPago;
	
	

	public VentaPago(int idVentaPago, Ventas venta, TipoPago tipoPago) {
		this.idVentaPago = idVentaPago;
		this.venta = venta;
		this.tipoPago = tipoPago;
	}

	public int getIdVentaPago() {
		return idVentaPago;
	}

	public void setIdVentaPago(int idVentaPago) {
		this.idVentaPago = idVentaPago;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	

}
