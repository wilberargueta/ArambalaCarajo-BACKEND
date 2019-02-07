package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name="usuario_role")
public class UsuarioRole {
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario_role")
	private int idUsuarioRole;
	
	@ManyToOne
	@JoinColumn(name="id_role", nullable=false)
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="id_usuario", nullable=false)
	private Usuario usuario;

	public UsuarioRole() {
		
	}

	public UsuarioRole(int idUsuarioRole, Role role, Usuario usuario) {
		this.idUsuarioRole = idUsuarioRole;
		this.role = role;
		this.usuario = usuario;
	}

	public int getIdUsuarioRole() {
		return idUsuarioRole;
	}

	public void setIdUsuarioRole(int idUsuarioRole) {
		this.idUsuarioRole = idUsuarioRole;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
