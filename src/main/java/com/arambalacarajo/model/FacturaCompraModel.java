package com.arambalacarajo.model;

public class FacturaCompraModel {

	private int idFacturaCompra;

	private ComprasModel compra;

	private FacturasModel factura;

	public FacturaCompraModel() {
		
	}

	public FacturaCompraModel(int idFacturaCompra, ComprasModel compra, FacturasModel factura) {
		this.idFacturaCompra = idFacturaCompra;
		this.compra = compra;
		this.factura = factura;
	}

	public int getIdFacturaCompra() {
		return idFacturaCompra;
	}

	public void setIdFacturaCompra(int idFacturaCompra) {
		this.idFacturaCompra = idFacturaCompra;
	}

	public ComprasModel getCompra() {
		return compra;
	}

	public void setCompra(ComprasModel compra) {
		this.compra = compra;
	}

	public FacturasModel getFactura() {
		return factura;
	}

	public void setFactura(FacturasModel factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "FacturaCompra [idFacturaCompra=" + idFacturaCompra + ", compra=" + compra + ", factura=" + factura
				+ "]";
	}

}
