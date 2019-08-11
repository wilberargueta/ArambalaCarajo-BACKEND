package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.arambalacarajo.component.ProductosSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "productos")
@JsonSerialize(using = ProductosSerializer.class)
public class Productos {
	@Id
	@GeneratedValue(generator = "prod-generator")
	@GenericGenerator(name = "prod-generator", parameters = @Parameter(name = "prefix", value = "P"), strategy = "com.arambalacarajo.generated.GeneradorProducto")
	@Column(name = "cod_producto")
	private String codProducto;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "activo", nullable = false)
	private boolean activo = true;

	@Column(name = "creado", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@CreatedDate
	private LocalDate creado;

	@Column(name = "actualizado", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@LastModifiedDate
	private LocalDate actualizado;

	@Column(name = "eliminado")
	private LocalDate eliminado;

	@Enumerated(EnumType.STRING)
	@JsonFormat(shape = JsonFormat.Shape.OBJECT)
	private Medidas medida;

	public Productos() {

	}

	public Productos(String codProducto, String nombre, boolean activo, LocalDate creado, LocalDate actualizado,
			LocalDate eliminado, Medidas medida) {
		super();
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
		this.medida = medida;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public LocalDate getCreado() {
		return creado;
	}

	public void setCreado(LocalDate creado) {
		this.creado = creado;
	}

	public LocalDate getActualizado() {
		return actualizado;
	}

	public void setActualizado(LocalDate actualizado) {
		this.actualizado = actualizado;
	}

	public LocalDate getEliminado() {
		return eliminado;
	}

	public void setEliminado(LocalDate eliminado) {
		this.eliminado = eliminado;
	}

	public Medidas getMedida() {
		return medida;
	}

	public void setMedida(Medidas medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "Productos [codProducto=" + codProducto + ", nombre=" + nombre + ", activo=" + activo + ", creado="
				+ creado + ", actualizado=" + actualizado + ", eliminado=" + eliminado + ", medida=" + medida + "]";
	}

	
}
