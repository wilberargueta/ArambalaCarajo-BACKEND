package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.ServiciosConvert;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ServiciosModel;
import com.arambalacarajo.repository.ServiciosRepository;

@Service("serviciosService")
public class ServiciosService {

	@Autowired
	@Qualifier("serviciosRepository")
	private ServiciosRepository cr;

	@Autowired
	@Qualifier("serviciosConvert")
	private ServiciosConvert cc;

	private Message m;

	public ServiciosModel addServicios(ServiciosModel cm) {
		

		return cc.EntityToModel(cr.save(cc.ModelToEntity(cm)));
	}

	public Message deleteServicios(ServiciosModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Servicios Eliminado Correctamente..");
		return m;
	}

	public Message updateServicios(ServiciosModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Servicios Update Correctamente..");
		return m;
	}

	public List<ServiciosModel> listaServicios() {

		List<ServiciosModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

	public ServiciosModel findServiciosById(int id) {

		return cc.EntityToModel(cr.findServicioByIdServicio(id));
	}

}
