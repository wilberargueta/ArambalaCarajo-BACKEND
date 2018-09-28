package com.arambalacarajo.model;

public enum ROLES {

	ADMINISTRADOR("Administrador"),
	CAJERO("Cajero"),
	TOMA_PEDIDO("Toma Pedido");

	private String roleName;

	ROLES(String role) {
		this.roleName = role;
	}

	public String getRole() {
		return this.roleName;
	}

	public void setRole(String role) {
		this.roleName = role;
	}
}
