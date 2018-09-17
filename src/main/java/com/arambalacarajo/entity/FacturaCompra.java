package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura_compra")
public class FacturaCompra {

	@Id
	@GeneratedValue
	@Column(name = "id_factura_compra")
	private int idFacturaCompra;

	@OneToOne
	@JoinColumn(name = "id_compra")
	private Compras compra;

	@OneToOne
	@JoinColumn(name = "id_factura")
	private Facturas factura;

	public FacturaCompra() {
		// TODO Auto-generated constructor stub
	}

	public FacturaCompra(int idFacturaCompra, Compras compra, Facturas factura) {
		this.idFacturaCompra = idFacturaCompra;
		this.compra = compra;
		this.factura = factura;
	}

	public int getIdFacturaCompra() {
		return idFacturaCompra;
	}

	public void setIdFacturaCompra(int idFacturaCompra) {
		this.idFacturaCompra = idFacturaCompra;
	}

	public Compras getCompra() {
		return compra;
	}

	public void setCompra(Compras compra) {
		this.compra = compra;
	}

	public Facturas getFactura() {
		return factura;
	}

	public void setFactura(Facturas factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "FacturaCompra [idFacturaCompra=" + idFacturaCompra + ", compra=" + compra + ", factura=" + factura
				+ "]";
	}

}
