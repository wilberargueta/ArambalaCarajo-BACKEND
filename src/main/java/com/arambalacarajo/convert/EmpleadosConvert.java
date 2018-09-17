package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Empleados;
import com.arambalacarajo.model.EmpleadosModel;

@Component("empleadosConvert")
public class EmpleadosConvert {

	public Empleados ModelToEntity(EmpleadosModel em) {
		Empleados e = new Empleados();

		e.setCodEmpleado(em.getCodEmpleado());
		e.setNombre(em.getNombre());
		e.setApellido(em.getApellido());
		e.setDui(em.getDui());
		e.setFechaNacimiento(em.getFechaNacimiento());
		e.setDireccion(em.getDireccion());
		e.setTelefono(em.getTelefono());
		e.setActivo(em.isActivo());
		e.setCreado(em.getCreado());
		e.setActualizado(em.getActualizado());
		e.setEliminado(em.getEliminado());

		return e;

	}

	public EmpleadosModel EntityToModel(Empleados em) {
		EmpleadosModel e = new EmpleadosModel();

		e.setCodEmpleado(em.getCodEmpleado());
		e.setNombre(em.getNombre());
		e.setApellido(em.getApellido());
		e.setDui(em.getDui());
		e.setFechaNacimiento(em.getFechaNacimiento());
		e.setDireccion(em.getDireccion());
		e.setTelefono(em.getTelefono());
		e.setActivo(em.isActivo());
		e.setCreado(em.getCreado());
		e.setActualizado(em.getActualizado());
		e.setEliminado(em.getEliminado());

		return e;

	}

}
