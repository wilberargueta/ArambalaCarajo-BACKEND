package com.arambalacarajo.entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {
	@Id
	@Column(name = "cod_producto")
	private char[] codProducto;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "medida", nullable = false)
	private String medida;

	@Column(name = "activo", nullable = false)
	private boolean activo = true;

	@Column(name = "creado", nullable = false)
	private LocalDate creado = LocalDate.now();

	@Column(name = "actualizado", nullable = false)
	private LocalDate actualizado = LocalDate.now();

	@Column(name = "eliminado")
	private LocalDate eliminado;

	public Productos() {
		// TODO Auto-generated constructor stub
	}

	public Productos(char[] codProducto, String nombre, String medida, boolean activo, LocalDate creado,
			LocalDate actualizado, LocalDate eliminado) {
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.medida = medida;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public char[] getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(char[] codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
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
		return "ProductosModel [codProducto=" + Arrays.toString(codProducto) + ", nombre=" + nombre + ", medida="
				+ medida + ", activo=" + activo + ", creado=" + creado + ", actualizado=" + actualizado + ", eliminado="
				+ eliminado + "]";
	}

}
