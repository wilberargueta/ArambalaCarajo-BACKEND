package com.arambalacarajo.model;

import java.time.LocalDate;

import com.arambalacarajo.entity.Medidas;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductosModel {

	private String codProducto;

	private String nombre;

	private boolean activo;
	
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	private LocalDate creado;
	
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	private LocalDate actualizado;
	
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	private LocalDate eliminado;

	private Medidas medida;

	public ProductosModel() {

	}

	public ProductosModel(String codProducto, String nombre, Medidas medida, boolean activo, LocalDate creado,
			LocalDate actualizado, LocalDate eliminado) {
		super();
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.medida = medida;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Medidas getMedida() {
		return medida;
	}

	public void setMedida(Medidas medida) {
		this.medida = medida;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public LocalDate getCreado() {
		return creado;
	}

	public void setCreado(LocalDate creado) {
		this.creado = creado;
	}

	public LocalDate getActualizado() {
		return actualizado;
	}

	public void setActualizado(LocalDate actualizado) {
		this.actualizado = actualizado;
	}

	public LocalDate getEliminado() {
		return eliminado;
	}

	public void setEliminado(LocalDate eliminado) {
		this.eliminado = eliminado;
	}

	@Override
	public String toString() {
		return "ProductosModel [codProducto=" + codProducto + ", nombre=" + nombre + ", medida=" + medida + ", activo="
				+ activo + ", creado=" + creado + ", actualizado=" + actualizado + ", eliminado=" + eliminado + "]";
	}

}
