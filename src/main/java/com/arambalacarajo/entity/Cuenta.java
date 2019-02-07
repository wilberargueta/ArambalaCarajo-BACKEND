package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator", 
      parameters = @Parameter(name = "prefix", value = "C"), 
      strategy = "com.arambalacarajo.generated.GeneradorProducto")
	@Column(name = "id_cuenta", unique = true)
	private String idCuenta;

	@Column(name = "fecha_cuenta", nullable = false, columnDefinition="DATE")
	private LocalDate fechaCuenta;

	@Column(name = "descuento", nullable = true)
	private String descuento;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "mesa", nullable = true)
	private int mesa;
	
	@Column(name="cobrada", nullable = false)
	private boolean cobrada;
	
	@Column(name="cobrable", nullable = false)
	private boolean cobrable;
	

	public Cuenta() {
	
	}

	public Cuenta(String idCuenta, LocalDate fechaCuenta, String descuento, String nombre, int mesa, boolean cobrada,
			boolean cobrable) {
		this.idCuenta = idCuenta;
		this.fechaCuenta = fechaCuenta;
		this.descuento = descuento;
		this.nombre = nombre;
		this.mesa = mesa;
		this.cobrada = cobrada;
		this.cobrable = cobrable;
		
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public LocalDate getFechaCuenta() {
		return fechaCuenta;
	}

	public void setFechaCuenta(LocalDate fechaCuenta) {
		this.fechaCuenta = fechaCuenta;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public boolean isCobrada() {
		return cobrada;
	}

	public void setCobrada(boolean cobrada) {
		this.cobrada = cobrada;
	}

	public boolean isCobrable() {
		return cobrable;
	}

	public void setCobrable(boolean cobrable) {
		this.cobrable = cobrable;
	}

	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", fechaCuenta=" + fechaCuenta + ", descuento=" + descuento
				+ ", nombre=" + nombre + ", mesa=" + mesa + ", cobrada=" + cobrada + ", cobrable=" + cobrable + "]";
	}



	
	

}
