package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.arambalacarajo.convert.EmpleadosConvert;
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

	public Message addEmpleado(EmpleadosModel em) {
		m = new Message();
		er.save(ec.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Empleado Agregado Correctamente..");
		return m;
	}

	public Message deleteEmpleado(EmpleadosModel em) {
		m = new Message();
		er.delete(ec.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Empleado Eliminado Correctamente..");
		return m;
	}

	public Message updateEmpleado(EmpleadosModel em) {
		m = new Message();
		er.save(ec.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Empleado Update Correctamente..");
		return m;
	}

	public List<EmpleadosModel> listaEmpleados() {

		List<EmpleadosModel> lcpm = new ArrayList<>();
		er.findAll().forEach(e -> lcpm.add(ec.EntityToModel(e)));

		return lcpm;
	}

	public EmpleadosModel findEmpleadoByCod(char[] cod) {

		return ec.EntityToModel(er.findEmpleadoByCodEmpleado(cod));
	}

}
