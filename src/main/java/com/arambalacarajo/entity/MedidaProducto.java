package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medida_producto")
public class MedidaProducto {
	
	@Id
	@GeneratedValue
	@Column(name="id_medida_producto")
	private int idMedidaProducto;
	
	@Column(name="tipo_medida")
	private String tipoMedida;

	public MedidaProducto() {

	}

	public MedidaProducto(int idMedidaProducto, String tipoMedida) {
		this.idMedidaProducto = idMedidaProducto;
		this.tipoMedida = tipoMedida;
	}

	public int getIdMedidaProducto() {
		return idMedidaProducto;
	}

	public void setIdMedidaProducto(int idMedidaProducto) {
		this.idMedidaProducto = idMedidaProducto;
	}

	public String getTipoMedida() {
		return tipoMedida;
	}

	public void setTipoMedida(String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}
	

}
