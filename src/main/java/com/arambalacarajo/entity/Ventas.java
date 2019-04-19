package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity()
@Table(name = "ventas")
public class Ventas {

	
	@Column(name = "id_venta", nullable = true)
	private int idVenta;

	@Id
	@GeneratedValue(generator = "prod-generator")
	@GenericGenerator(name = "prod-generator", 
	parameters = @Parameter(name = "prefix", value = "V"), 
	strategy = "com.arambalacarajo.generated.GeneradorProducto")
	@Column(name = "registro_venta", unique = true)
	private String registroVenta;

	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;

	@Column(name = "detalle", nullable = true)
	private String detalle;

	public Ventas() {
	
	}

	public Ventas(int idVenta, String registroVenta, LocalDate fecha, String detalle) {
		this.idVenta = idVenta;
		this.registroVenta = registroVenta;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public String getRegistroVenta() {
		return registroVenta;
	}

	public void setRegistroVenta(String registroVenta) {
		this.registroVenta = registroVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Ventas [idVenta=" + idVenta + ", registroVenta=" + registroVenta + ", fecha=" + fecha + ", detalle="
				+ detalle + "]";
	}
	
	
}
