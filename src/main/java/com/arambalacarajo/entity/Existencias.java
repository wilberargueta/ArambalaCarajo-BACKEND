package com.arambalacarajo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "existencias")
public class Existencias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_existencia")
	private int idExistencias;

	@Column(name = "cantidad")
	private double cantidad;


	@OneToOne
	@JoinColumn(name = "cod_producto")
	private Productos productos;

	public Existencias() {

	}

	public Existencias(int idExistencias, double cantidad, Productos productos) {
		this.idExistencias = idExistencias;
		this.cantidad = cantidad;
		this.productos = productos;
	}

	public int getIdExistencias() {
		return idExistencias;
	}

	public void setIdExistencias(int idExistencias) {
		this.idExistencias = idExistencias;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	
	

	

}
