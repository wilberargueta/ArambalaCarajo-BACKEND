package com.arambalacarajo.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProveedoresModel {

	private String codProveedor;

	private String razonSocial;

	private char[] nit;

	private char[] telefono;

	private String direccion;

	private String correo;

	private boolean activo = true;
	
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	private LocalDate creado;
	
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	private LocalDate actualizado;
	
	@JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
	private LocalDate eliminado;

	public ProveedoresModel() {

	}

	public ProveedoresModel(String codProveedor, String razonSocial, char[] nit, char[] telefono, String direccion,
			String correo, boolean activo, LocalDate creado, LocalDate actualizado, LocalDate eliminado) {
		this.codProveedor = codProveedor;
		this.razonSocial = razonSocial;
		this.nit = nit;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public String getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(String codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public char[] getNit() {
		return nit;
	}

	public void setNit(char[] nit) {
		this.nit = nit;
	}

	public char[] getTelefono() {
		return telefono;
	}

	public void setTelefono(char[] telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

}
