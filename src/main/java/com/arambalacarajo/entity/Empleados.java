package com.arambalacarajo.entity;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "empleados")
public class Empleados {

	@Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator", 
      parameters = @Parameter(name = "prefix", value = "E"), 
      strategy = "com.arambalacarajo.generated.GeneradorProducto")
	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "apellido", nullable = false)
	private String apellido;

	@Column(name = "dui", nullable = false)
	private String dui;

	@Column(name = "f_nacimiento", nullable = false)
	private LocalDate fechaNacimiento;

	@Column(name = "direccion", nullable = false)
	private String direccion;

	@Column(name = "telefono", nullable = false)
	private String telefono;

	@Column(name = "activo", nullable = false)
	private boolean activo = true;

	@Column(name = "creado", nullable = false)
	private LocalDate creado = LocalDate.now();

	@Column(name = "actualizado", nullable = false)
	private LocalDate actualizado = LocalDate.now();

	@Column(name = "eliminado")
	private LocalDate eliminado;

	public Empleados() {
		// TODO Auto-generated constructor stub
	}

	public Empleados(String codEmpleado, String nombre, String apellido, String dui, LocalDate fechaNacimiento,
			String direccion, String telefono) {
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
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
		return "Empleados [codEmpleado=" + codEmpleado + ", nombre=" + nombre + ", apellido="
				+ apellido + ", dui=" + dui + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", activo=" + activo + ", creado=" + creado + ", actualizado="
				+ actualizado + ", eliminado=" + eliminado + "]";
	}

}
