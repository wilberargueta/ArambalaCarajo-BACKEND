package com.arambalacarajo.model;

import java.time.LocalDate;

import com.arambalacarajo.entity.TipoComprobante;

public class FacturasModel {

	private int idFactura;

	private String numFactura;

	private String razonSocial;

	private String correlativoFactura;

	private LocalDate fechaFactura;

	private int iva;

	private String detalle;

	private TipoComprobante tipoComprobante;

	public FacturasModel() {

	}

	public FacturasModel(int idFactura, String numFactura, String razonSocial, String correlativoFactura,
			LocalDate fechaFactura, int iva, String detalle, TipoComprobante tipoComprobante) {
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.razonSocial = razonSocial;
		this.correlativoFactura = correlativoFactura;
		this.fechaFactura = fechaFactura;
		this.iva = iva;
		this.detalle = detalle;
		this.tipoComprobante = tipoComprobante;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCorrelativoFactura() {
		return correlativoFactura;
	}

	public void setCorrelativoFactura(String correlativoFactura) {
		this.correlativoFactura = correlativoFactura;
	}

	public LocalDate getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public TipoComprobante getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(TipoComprobante tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	@Override
	public String toString() {
		return "FacturasModel [idFactura=" + idFactura + ", numFactura=" + numFactura + ", razonSocial=" + razonSocial
				+ ", correlativoFactura=" + correlativoFactura + ", fechaFactura=" + fechaFactura + ", iva=" + iva
				+ ", detalle=" + detalle + ", tipoComprobante=" + tipoComprobante + "]";
	}

}
