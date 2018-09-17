package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ServiciosModel;
import com.arambalacarajo.service.ServiciosService;

@RestController
public class ServiciosController {

	@Autowired
	@Qualifier("serviciosService")
	private ServiciosService ss;

	@RequestMapping(path = "/api/servicios", method = RequestMethod.GET)
	public List<ServiciosModel> lista() {

		return ss.listaServicios();
	}

	@RequestMapping(path = "/api/servicios/{id}", method = RequestMethod.GET)
	public ServiciosModel byId(@PathVariable int id) {

		return ss.findServiciosById(id);
	}

	@RequestMapping(path = "/api/servicios", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ServiciosModel sm) {

		return ss.addServicios(sm);
	}

	@RequestMapping(path = "/api/servicios", method = RequestMethod.PUT)
	public Message update(@RequestBody ServiciosModel sm) {

		return ss.updateServicios(sm);
	}

	@RequestMapping(path = "/api/servicios", method = RequestMethod.DELETE)
	public Message delete(@RequestBody ServiciosModel sm) {

		return ss.deleteServicios(sm);
	}

}
