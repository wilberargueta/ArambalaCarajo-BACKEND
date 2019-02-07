package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario")
	private int idUsuario;
	
	@Column(name="nick", nullable = false, unique=true)
	private String nick;
	
	@Column(name="pass", nullable=false)
	private String pass;
	
	

	public Usuario(int idUsuario, String nick, String pass) {
		super();
		this.idUsuario = idUsuario;
		this.nick = nick;
		this.pass = pass;
	}

	public Usuario() {
	
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
