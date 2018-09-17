package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura_venta")
public class FacturaVenta {

	@Id
	@GeneratedValue
	@Column(name = "id_factura_venta")
	private int idFacturaVenta;

	@OneToOne
	@JoinColumn(name = "id_venta")
	private Ventas venta;

	@OneToOne
	@JoinColumn(name = "id_factura")
	private Facturas factura;

	public FacturaVenta() {
		// TODO Auto-generated constructor stub
	}

	public FacturaVenta(int idFacturaVenta, Ventas venta, Facturas factura) {
		this.idFacturaVenta = idFacturaVenta;
		this.venta = venta;
		this.factura = factura;
	}

	public int getIdFacturaVenta() {
		return idFacturaVenta;
	}

	public void setIdFacturaVenta(int idFacturaVenta) {
		this.idFacturaVenta = idFacturaVenta;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	public Facturas getFactura() {
		return factura;
	}

	public void setFactura(Facturas factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "FacturaVenta [idFacturaVenta=" + idFacturaVenta + ", venta=" + venta + ", factura=" + factura + "]";
	}

}
