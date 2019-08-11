package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "receta_productos")
public class RecetaProductos {

	@Id
	@GeneratedValue
	@Column(name = "id_receta_producto")
	private int idRecetaProducto;

	@ManyToOne
	@JoinColumn(name = "id_receta")
	private Recetas receta;

	@OneToOne
	@JoinColumn(name = "cod_producto")
	private Productos producto;

	@Column(name = "cantidad")
	private double cantidad;

	@Enumerated(EnumType.STRING)
	private Medidas medida;

	public RecetaProductos() {

	}

	public RecetaProductos(int idRecetaProducto, Recetas receta, Productos producto, double cantidad, Medidas medida) {
		super();
		this.idRecetaProducto = idRecetaProducto;
		this.receta = receta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.medida = medida;
	}

	public int getIdRecetaProducto() {
		return idRecetaProducto;
	}

	public void setIdRecetaProducto(int idRecetaProducto) {
		this.idRecetaProducto = idRecetaProducto;
	}

	public Recetas getReceta() {
		return receta;
	}

	public void setReceta(Recetas receta) {
		this.receta = receta;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Medidas getMedida() {
		return medida;
	}

	public void setMedida(Medidas medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "RecetaProductos [idRecetaProducto=" + idRecetaProducto + ", receta=" + receta + ", producto=" + producto
				+ ", cantidad=" + cantidad + ", medida=" + medida + "]";
	}

}
