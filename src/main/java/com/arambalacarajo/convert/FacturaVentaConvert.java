package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.FacturaVenta;
import com.arambalacarajo.model.FacturaVentaModel;

@Component("facturaVentaConvert")
public class FacturaVentaConvert {

	@Autowired
	private FacturasConvert fc;

	@Autowired
	private VentasConvert vc;

	public FacturaVenta ModelToEntity(FacturaVentaModel fvm) {

		FacturaVenta fv = new FacturaVenta();
		fv.setIdFacturaVenta(fvm.getIdFacturaVenta());
		fv.setFactura(fc.ModelToEntity(fvm.getFactura()));
		fv.setVenta(vc.ModelToEntity(fvm.getVenta()));

		return fv;

	}

	public FacturaVentaModel EntityToModel(FacturaVenta fvm) {

		FacturaVentaModel fv = new FacturaVentaModel();
		fv.setIdFacturaVenta(fvm.getIdFacturaVenta());
		fv.setFactura(fc.EntityToModel(fvm.getFactura()));
		fv.setVenta(vc.EntityToModel(fvm.getVenta()));

		return fv;

	}

}
