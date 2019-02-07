package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity(name="usuario_empleado")
public class UsuarioEmpleado {
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario_empleado")
	private int idUsuarioEmpleado;
	
	@OneToOne
	@JoinColumn(name="cod_empleado")
	private Empleados empleado;
	
	@OneToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public UsuarioEmpleado() {
		
	}

	public UsuarioEmpleado(int idUsuarioEmpleado, Empleados empleado, Usuario usuario) {

		this.idUsuarioEmpleado = idUsuarioEmpleado;
		this.empleado = empleado;
		this.usuario = usuario;
	}

	public int getIdUsuarioEmpleado() {
		return idUsuarioEmpleado;
	}

	public void setIdUsuarioEmpleado(int idUsuarioEmpleado) {
		this.idUsuarioEmpleado = idUsuarioEmpleado;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
