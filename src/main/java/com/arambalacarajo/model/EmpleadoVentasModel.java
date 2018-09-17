package com.arambalacarajo.model;

public class EmpleadoVentasModel {

	private int idEmpleadoVenta;

	private VentasModel venta;

	private EmpleadosModel empleado;

	public EmpleadoVentasModel() {
		// TODO Auto-generated constructor stub
	}

	public EmpleadoVentasModel(int idEmpleadoVenta, VentasModel venta, EmpleadosModel empleado) {
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

	public VentasModel getVenta() {
		return venta;
	}

	public void setVenta(VentasModel venta) {
		this.venta = venta;
	}

	public EmpleadosModel getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadosModel empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "EmpleadoVentas [idEmpleadoVenta=" + idEmpleadoVenta + ", venta=" + venta + ", empleado=" + empleado
				+ "]";
	}

}
