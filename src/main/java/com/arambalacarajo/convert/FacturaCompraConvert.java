package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.FacturaCompra;
import com.arambalacarajo.model.FacturaCompraModel;

@Component("facturaCompraConvert")
public class FacturaCompraConvert {

	@Autowired
	private ComprasConvert c;

	@Autowired
	private FacturasConvert f;

	public FacturaCompra ModelToEntity(FacturaCompraModel fcm) {
		FacturaCompra fc = new FacturaCompra();
		fc.setIdFacturaCompra(fcm.getIdFacturaCompra());
		fc.setCompra(c.ModelToEntity(fcm.getCompra()));
		fc.setFactura(f.ModelToEntity(fcm.getFactura()));

		return fc;
	}

	public FacturaCompraModel EntityToModel(FacturaCompra fcm) {
		FacturaCompraModel fc = new FacturaCompraModel();
		fc.setIdFacturaCompra(fcm.getIdFacturaCompra());
		fc.setCompra(c.EntityToModel(fcm.getCompra()));
		fc.setFactura(f.EntityToModel(fcm.getFactura()));

		return fc;
	}

}
