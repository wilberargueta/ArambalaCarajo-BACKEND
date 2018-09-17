package com.arambalacarajo.model;

import java.time.LocalDate;

public class MenusModel {

	private int idMenu;

	private String nombre;

	private String detalles;

	private String precio;

	private Boolean activo;

	private LocalDate creado;

	private LocalDate actualizado;

	private LocalDate eliminado;

	public MenusModel() {

	}

	public MenusModel(int idMenu, String nombre, String detalles, String precio, Boolean activo, LocalDate creado,
			LocalDate actualizado, LocalDate eliminado) {
		this.idMenu = idMenu;
		this.nombre = nombre;
		this.detalles = detalles;
		this.precio = precio;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
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
		return "Menus [idMenu=" + idMenu + ", nombre=" + nombre + ", detalles=" + detalles + ", precio=" + precio
				+ ", activo=" + activo + ", creado=" + creado + ", actualizado=" + actualizado + ", eliminado="
				+ eliminado + "]";
	}

}
