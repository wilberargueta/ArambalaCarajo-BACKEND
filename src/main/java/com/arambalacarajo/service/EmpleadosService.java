package com.arambalacarajo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.arambalacarajo.convert.EmpleadosConvert;
import com.arambalacarajo.entity.Empleados;
import com.arambalacarajo.model.EmpleadosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.EmpleadosRepository;

@Service("empleadosService")
public class EmpleadosService {

	@Autowired
	@Qualifier("empleadosRepository")
	private EmpleadosRepository er;

	@Autowired
	@Qualifier("empleadosConvert")
	private EmpleadosConvert ec;

	private Message m;

	public EmpleadosModel addEmpleado(EmpleadosModel em) {

		return ec.EntityToModel(er.saveAndFlush(ec.ModelToEntity(em)));
	}

	public Message deleteEmpleado(EmpleadosModel em) {
		Empleados e = ec.ModelToEntity(em);
		e.setActivo(false);
		e.setEliminado(LocalDate.now());
		m = new Message();
		er.saveAndFlush(e);
		m.setStatus(HttpStatus.OK);
		m.setMessage("Empleado Eliminado Correctamente..");
		return m;
	}

	public Message updateEmpleado(EmpleadosModel em) {
	
		m = new Message();
		// this.LOGGER.info(ec.ModelToEntity(em).toString());
		em.setActualizado(LocalDate.now());
		
		er.saveAndFlush(ec.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Empleado Update Correctamente..");
		return m;
	}

	public List<EmpleadosModel> listaEmpleados() {

		List<EmpleadosModel> lcpm = new ArrayList<>();
		er.findAll().forEach(e -> lcpm.add(ec.EntityToModel(e)));

		return lcpm;
	}

	public List<EmpleadosModel> listaEmpleadosByNombre(String nombre) {

		List<EmpleadosModel> lcpm = new ArrayList<>();
		er.findEmpleadoByNombreContaining(nombre).forEach(e -> lcpm.add(ec.EntityToModel(e)));

		return lcpm;
	}

	public EmpleadosModel findEmpleadoByCod(String cod) {

		return ec.EntityToModel(er.findEmpleadoByCodEmpleado(cod));
	}

	public List<EmpleadosModel> empleadosActivos() {
		List<EmpleadosModel> lcpm = new ArrayList<>();
		er.findEmpleadoByActivo(true).forEach(e -> lcpm.add(ec.EntityToModel(e)));

		return lcpm;
	}

	public List<EmpleadosModel> empleadosNoActivos() {
		List<EmpleadosModel> lcpm = new ArrayList<>();
		er.findEmpleadoByActivo(false).forEach(e -> lcpm.add(ec.EntityToModel(e)));

		return lcpm;
	}

}
