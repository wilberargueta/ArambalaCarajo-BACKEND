package com.arambalacarajo.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "facturas")
public class Facturas {

	@Id
	@GeneratedValue
	@Column(name = "id_factura")
	private int idFactura;

	@Column(name = "num_factura", nullable = false)
	private String numFactura;

	@Column(name = "razon_social", nullable = true)
	private String razonSocial;

	@Column(name = "correlativo_factura", nullable = false)
	private String correlativoFactura;

	@Column(name = "fecha_factura", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@CreatedDate
	private LocalDate fechaFactura;

	@Column(name = "iva")
	private int iva;

	@Column(name = "detalles", nullable = true)
	private String detalle;

	@ManyToOne
	@JoinColumn(name = "id_tipo_comprobante")
	private TipoComprobante tipoComprobante;

	public Facturas() {

	}

	public Facturas(int idFactura, String numFactura, String razonSocial, String correlativoFactura,
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
		return "Facturas [idFactura=" + idFactura + ", numFactura=" + numFactura + ", razonSocial=" + razonSocial
				+ ", correlativoFactura=" + correlativoFactura + ", fechaFactura=" + fechaFactura + ", iva=" + iva
				+ ", detalle=" + detalle + ", tipoComprobante=" + tipoComprobante + "]";
	}

}
