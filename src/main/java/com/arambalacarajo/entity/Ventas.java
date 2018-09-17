package com.arambalacarajo.entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "ventas")
public class Ventas {

	@Id
	@GeneratedValue
	@Column(name = "id_venta")
	private int idVenta;

	@Column(name = "num_registro", nullable = false)
	private char[] numRegistro;

	@Column(name = "fecha", nullable = false)
	private LocalDate fecha = LocalDate.now();

	@Column(name = "detalle")
	private String detalle;

	public Ventas() {
		// TODO Auto-generated constructor stub
	}

	public Ventas(int idVenta, char[] numRegistro, LocalDate fecha, String detalle) {
		this.idVenta = idVenta;
		this.numRegistro = numRegistro;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public char[] getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(char[] numRegistro) {
		this.numRegistro = numRegistro;
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
		return "Ventas [idVenta=" + idVenta + ", numRegistro=" + Arrays.toString(numRegistro) + ", fecha=" + fecha
				+ ", detalle=" + detalle + "]";
	}

}
