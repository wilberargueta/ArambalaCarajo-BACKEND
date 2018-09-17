package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.arambalacarajo.convert.EmpleadoVentasConvert;
import com.arambalacarajo.convert.EmpleadosConvert;
import com.arambalacarajo.model.EmpleadoVentasModel;
import com.arambalacarajo.model.EmpleadosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.EmpleadoVentasRepository;

@Service("empleadoVentasService")
public class EmpleadoVentasService {

	@Autowired
	@Qualifier("empleadoVentasRepository")
	private EmpleadoVentasRepository evr;

	@Autowired
	@Qualifier("empleadoVentasConvert")
	private EmpleadoVentasConvert evc;

	@Autowired
	@Qualifier("empleadosConvert")
	private EmpleadosConvert ec;

	private Message m;

	public Message addEmpleadoVentas(EmpleadoVentasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("EmpleadoVentas Agregado Correctamente..");
		return m;
	}

	public Message deleteEmpleadoVentas(EmpleadoVentasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("EmpleadoVentas Eliminado Correctamente..");
		return m;
	}

	public Message updateEmpleadoVentas(EmpleadoVentasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("EmpleadoVentas Update Correctamente..");
		return m;
	}

	public List<EmpleadoVentasModel> listaEmpleadoVentas() {

		List<EmpleadoVentasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public EmpleadoVentasModel findEmpleadoVentasById(int id) {

		return evc.EntityToModel(evr.findEmpleadoVentasByIdEmpleadoVenta(id));
	}

	public List<EmpleadoVentasModel> listaEmpleadoVentasByEmpleado(EmpleadosModel em) {

		List<EmpleadoVentasModel> lcpm = new ArrayList<>();
		evr.findByEmpleado(ec.ModelToEntity(em)).forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

}
