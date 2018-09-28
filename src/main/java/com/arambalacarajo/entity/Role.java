package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "role")
public class Role {

	@Id
	@GeneratedValue
	@Column(name = "id_role")
	private int idRole;

	@Column(name = "role")
	private String role;

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(int idRole, String role) {
		this.idRole = idRole;
		this.role = role;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
