package com.arambalacarajo.model;

public class FacturaVentaModel {

	private int idFacturaVenta;

	private VentasModel venta;

	private FacturasModel factura;

	public FacturaVentaModel() {
		// TODO Auto-generated constructor stub
	}

	public FacturaVentaModel(int idFacturaVenta, VentasModel venta, FacturasModel factura) {
		this.idFacturaVenta = idFacturaVenta;
		this.venta = venta;
		this.factura = factura;
	}

	public int getIdFacturaVenta() {
		return idFacturaVenta;
	}

	public void setIdFacturaVenta(int idFacturaVenta) {
		this.idFacturaVenta = idFacturaVenta;
	}

	public VentasModel getVenta() {
		return venta;
	}

	public void setVenta(VentasModel venta) {
		this.venta = venta;
	}

	public FacturasModel getFactura() {
		return factura;
	}

	public void setFactura(FacturasModel factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "FacturaVenta [idFacturaVenta=" + idFacturaVenta + ", venta=" + venta + ", factura=" + factura + "]";
	}

}
