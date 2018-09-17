package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Facturas;
import com.arambalacarajo.model.FacturasModel;

@Component("facturasConvert")
public class FacturasConvert {

	public Facturas ModelToEntity(FacturasModel fm) {
		Facturas f = new Facturas();

		f.setIdFactura(fm.getIdFactura());
		f.setCorrelativoFactura(fm.getCorrelativoFactura());
		f.setNumFactura(fm.getNumFactura());
		f.setFechaFactura(fm.getFechaFactura());
		f.setIva(fm.getIva());
		f.setDetalle(fm.getDetalle());
		return f;
	}

	public FacturasModel EntityToModel(Facturas fm) {
		FacturasModel f = new FacturasModel();

		f.setIdFactura(fm.getIdFactura());
		f.setCorrelativoFactura(fm.getCorrelativoFactura());
		f.setNumFactura(fm.getNumFactura());
		f.setFechaFactura(fm.getFechaFactura());
		f.setIva(fm.getIva());
		f.setDetalle(fm.getDetalle());
		return f;
	}

}
