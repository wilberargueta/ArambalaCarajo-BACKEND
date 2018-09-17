package com.arambalacarajo.model;

import java.time.LocalDate;
import java.util.Arrays;

public class EmpleadosModel {

	private char[] codEmpleado;

	private String nombre;

	private String apellido;

	private String dui;

	private LocalDate fechaNacimiento;

	private String direccion;

	private String telefono;

	private boolean activo = true;

	private LocalDate creado;

	private LocalDate actualizado;

	private LocalDate eliminado;

	public EmpleadosModel() {
		// TODO Auto-generated constructor stub
	}

	public EmpleadosModel(char[] codEmpleado, String nombre, String apellido, String dui, LocalDate fechaNacimiento,
			String direccion, String telefono) {
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public char[] getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(char[] codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
		return "Empleados [codEmpleado=" + Arrays.toString(codEmpleado) + ", nombre=" + nombre + ", apellido="
				+ apellido + ", dui=" + dui + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", activo=" + activo + ", creado=" + creado + ", actualizado="
				+ actualizado + ", eliminado=" + eliminado + "]";
	}

}
