package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleado_ventas")
public class EmpleadoVentas {

	@Id
	@GeneratedValue
	@Column(name = "id_empleado_venta")
	private int idEmpleadoVenta;

	@OneToOne
	@JoinColumn(name = "id_venta")
	private Ventas venta;

	@ManyToOne
	@JoinColumn(name = "cod_empleado")
	private Empleados empleado;

	public EmpleadoVentas() {
		// TODO Auto-generated constructor stub
	}

	public EmpleadoVentas(int idEmpleadoVenta, Ventas venta, Empleados empleado) {
		this.idEmpleadoVenta = idEmpleadoVenta;
		this.venta = venta;
		this.empleado = empleado;
	}

	public int getIdEmpleadoVenta() {
		return idEmpleadoVenta;
	}

	public void setIdEmpleadoVenta(int idEmpleadoVenta) {
		this.idEmpleadoVenta = idEmpleadoVenta;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "EmpleadoVentas [idEmpleadoVenta=" + idEmpleadoVenta + ", venta=" + venta + ", empleado=" + empleado
				+ "]";
	}

}
