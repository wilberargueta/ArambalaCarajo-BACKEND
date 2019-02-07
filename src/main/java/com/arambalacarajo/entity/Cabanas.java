package com.arambalacarajo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "cabanas")
public class Cabanas {
	@Id
	@GeneratedValue(generator = "prod-generator")
	@GenericGenerator(name = "prod-generator", parameters = @Parameter(name = "prefix", value = "C"), strategy = "com.arambalacarajo.generated.GeneradorProducto")
	
	@Column(name = "cod_cabana")
	private String codCabana;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private String precio;

	@Column(name = "disponible")
	private boolean disponible;

	@Column(name = "detalle", nullable = true)
	private String detalle;

	public Cabanas() {
	
	}

	public Cabanas(String codCabana, String nombre, String precio, boolean disponible, String detalle) {
		this.codCabana = codCabana;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
		this.detalle = detalle;
	}

	public String getCodCabana() {
		return codCabana;
	}

	public void setCodCabana(String codCabana) {
		this.codCabana = codCabana;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	

}
