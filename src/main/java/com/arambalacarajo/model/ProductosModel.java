package com.arambalacarajo.model;

import java.time.LocalDate;

import com.arambalacarajo.entity.MedidaProducto;

public class ProductosModel {

	private String codProducto;

	private String nombre;

	private MedidaProducto medida;

	private boolean activo;

	private LocalDate creado;

	private LocalDate actualizado;

	private LocalDate eliminado;

	public ProductosModel() {
		
	}

	public ProductosModel(String codProducto, String nombre, MedidaProducto medida, boolean activo, LocalDate creado,
			LocalDate actualizado, LocalDate eliminado) {
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

	public MedidaProducto getMedida() {
		return medida;
	}

	public void setMedida(MedidaProducto medida) {
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
