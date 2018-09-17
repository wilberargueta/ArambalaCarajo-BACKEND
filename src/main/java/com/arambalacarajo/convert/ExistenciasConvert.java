package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Existencias;
import com.arambalacarajo.model.ExistenciasModel;

@Component("existenciasConvert")
public class ExistenciasConvert {

	@Autowired
	private ProductosConvert pc;

	public Existencias ModelToEntity(ExistenciasModel em) {

		Existencias e = new Existencias();
		e.setIdExistencias(em.getIdExistencias());
		e.setProductos(pc.ModelToEntity(em.getProductos()));
		e.setCantidad(em.getCantidad());

		return e;
	}

	public ExistenciasModel EntityToModel(Existencias em) {

		ExistenciasModel e = new ExistenciasModel();
		e.setIdExistencias(em.getIdExistencias());
		e.setProductos(pc.EntityToModel(em.getProductos()));
		e.setCantidad(em.getCantidad());

		return e;
	}

}
