package com.arambalacarajo.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "compras")
public class Compras {

	@Column(name = "id_compra", nullable = true)
	private int idCompra;

	@Id
	@GeneratedValue(generator = "prod-generator")
	@GenericGenerator(name = "prod-generator", parameters = @Parameter(name = "prefix", value = "R"), strategy = "com.arambalacarajo.generated.GeneradorProducto")
	@Column(name = "registro_compra", unique = true)
	private String registroCompra;

	@Column(name = "fecha_compra")
	private LocalDate fechaCompra;

	@Column(name = "detalle")
	private String detalle;

	@ManyToOne
	@JoinColumn(name = "cod_proveedor")
	private Proveedores proveedor;

	@OneToMany(mappedBy = "compras")
	private List<CompraProductos> compraProducto;

	public Compras() {
		// TODO Auto-generated constructor stub
	}

	public Compras(int idCompra, String registroCompra, LocalDate fechaCompra, String detalle, Proveedores proveedor) {
		this.idCompra = idCompra;
		this.registroCompra = registroCompra;
		this.fechaCompra = fechaCompra;
		this.detalle = detalle;
		this.proveedor = proveedor;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public String getRegistroCompra() {
		return registroCompra;
	}

	public void setRegistroCompra(String registroCompra) {
		this.registroCompra = registroCompra;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Compras [idCompra=" + idCompra + ", registroCompra=" + registroCompra + ", fechaCompra=" + fechaCompra
				+ ", detalle=" + detalle + ", proveedor=" + proveedor + "]";
	}

}
