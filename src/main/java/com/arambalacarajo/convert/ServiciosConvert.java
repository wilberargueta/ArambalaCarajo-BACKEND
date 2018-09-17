package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Servicios;
import com.arambalacarajo.model.ServiciosModel;

@Component("serviciosConvert")
public class ServiciosConvert {

	public Servicios ModelToEntity(ServiciosModel sm) {
		Servicios s = new Servicios();
		s.setIdServicio(sm.getIdServicio());
		s.setNombre(sm.getNombre());
		s.setPrecio(sm.getPrecio());
		s.setDetalle(sm.getDetalle());

		return s;

	}

	public ServiciosModel EntityToModel(Servicios sm) {
		ServiciosModel s = new ServiciosModel();
		s.setIdServicio(sm.getIdServicio());
		s.setNombre(sm.getNombre());
		s.setPrecio(sm.getPrecio());
		s.setDetalle(sm.getDetalle());

		return s;

	}

}
