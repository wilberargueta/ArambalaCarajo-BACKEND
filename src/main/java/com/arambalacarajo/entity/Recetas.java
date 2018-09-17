package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recetas")
public class Recetas {

	@Id
	@GeneratedValue
	@Column(name = "id_receta")
	private int idReceta;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "detalle", nullable = false)
	private String detalle;

	@Column(name = "activa", nullable = false)
	private boolean activa = true;

	@Column(name = "creado", nullable = false)
	private LocalDate creado = LocalDate.now();

	@Column(name = "actualizado", nullable = false)
	private LocalDate actualizado = LocalDate.now();

	@Column(name = "eliminado")
	private LocalDate eliminado;

	public Recetas() {
		// TODO Auto-generated constructor stub
	}

	public Recetas(int idReceta, String nombre, String detalle, boolean activa, LocalDate creado, LocalDate actualizado,
			LocalDate eliminado) {
		this.idReceta = idReceta;
		this.nombre = nombre;
		this.detalle = detalle;
		this.activa = activa;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public int getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
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
		return "Recetas [idReceta=" + idReceta + ", nombre=" + nombre + ", detalle=" + detalle + ", activa=" + activa
				+ ", creado=" + creado + ", actualizado=" + actualizado + ", eliminado=" + eliminado + "]";
	}

}
