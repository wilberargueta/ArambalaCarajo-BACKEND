package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Proveedores;
import com.arambalacarajo.model.ProveedoresModel;

@Component("proveedoresConvert")
public class ProveedoresConvert {

	public Proveedores ModelToEntity(ProveedoresModel pm) {
		Proveedores p = new Proveedores();
		p.setCodProveedor(pm.getCodProveedor());
		p.setRazonSocial(pm.getRazonSocial());
		p.setNit(pm.getNit());
		p.setTelefono(pm.getTelefono());
		p.setCorreo(pm.getCorreo());
		p.setDireccion(pm.getDireccion());
		p.setActivo(pm.isActivo());
		p.setCreado(pm.getCreado());
		p.setActualizado(pm.getActualizado());
		p.setEliminado(pm.getEliminado());

		return p;
	}

	public ProveedoresModel EntityToModel(Proveedores pm) {
		ProveedoresModel p = new ProveedoresModel();
		p.setCodProveedor(pm.getCodProveedor());
		p.setRazonSocial(pm.getRazonSocial());
		p.setNit(pm.getNit());
		p.setTelefono(pm.getTelefono());
		p.setCorreo(pm.getCorreo());
		p.setDireccion(pm.getDireccion());
		p.setActivo(pm.isActivo());
		p.setCreado(pm.getCreado());
		p.setActualizado(pm.getActualizado());
		p.setEliminado(pm.getEliminado());

		return p;
	}

}
