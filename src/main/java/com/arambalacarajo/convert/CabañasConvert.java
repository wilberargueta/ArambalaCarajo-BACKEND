package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Cabanas;
import com.arambalacarajo.model.CabañasModel;

@Component("cabañasConvert")
public class CabañasConvert {

	public Cabanas ModelToEntity(CabañasModel cm) {
		Cabanas c = new Cabanas();
		c.setCodCabaña(cm.getCodCabana());
		c.setNombre(cm.getNombre());
		c.setPrecio(cm.getPrecio());
		c.setDisponible(cm.isDisponible());
		c.setDetalle(cm.getDetalle());
		return c;

	}

	public CabañasModel EntityToModel(Cabanas cm) {
		CabañasModel c = new CabañasModel();
		c.setCodCabana(cm.getCodCabaña());
		c.setNombre(cm.getNombre());
		c.setPrecio(cm.getPrecio());
		c.setDisponible(cm.isDisponible());
		c.setDetalle(cm.getDetalle());
		return c;

	}

}
