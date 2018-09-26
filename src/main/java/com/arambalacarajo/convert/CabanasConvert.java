package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Cabanas;
import com.arambalacarajo.model.CabanasModel;

@Component("cabanasConvert")
public class CabanasConvert {

	public Cabanas ModelToEntity(CabanasModel cm) {
		Cabanas c = new Cabanas();
		c.setCodCabana(cm.getCodCabana());
		c.setNombre(cm.getNombre());
		c.setPrecio(cm.getPrecio());
		c.setDisponible(cm.isDisponible());
		c.setDetalle(cm.getDetalle());
		return c;

	}

	public CabanasModel EntityToModel(Cabanas cm) {
		CabanasModel c = new CabanasModel();
		c.setCodCabana(cm.getCodCabana());
		c.setNombre(cm.getNombre());
		c.setPrecio(cm.getPrecio());
		c.setDisponible(cm.isDisponible());
		c.setDetalle(cm.getDetalle());
		return c;

	}

}
