package com.arambalacarajo.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	
	Log LOGG = LogFactory.getLog(ServiciosController.class);
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/servicios", method = RequestMethod.GET)
	public List<ServiciosModel> lista() {

		return ss.listaServicios();
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/servicios/{id}", method = RequestMethod.GET)
	public ServiciosModel byId(@PathVariable int id) {

		return ss.findServiciosById(id);
	}
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/servicios/busqueda/{nombre}", method = RequestMethod.GET)
	public List<ServiciosModel> listaByName(@PathVariable String nombre) {
		LOGG.info(nombre);
		return ss.listaServiciosByNombre(nombre);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/servicios", method = RequestMethod.POST)
	public ServiciosModel nuevo(@RequestBody ServiciosModel sm) {

		return ss.addServicios(sm);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/servicios/update", method = RequestMethod.POST)
	public Message update(@RequestBody ServiciosModel sm) {

		return ss.updateServicios(sm);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/servicios/delete", method = RequestMethod.POST)
	public Message delete(@RequestBody ServiciosModel sm) {

		return ss.deleteServicios(sm);
	}

}
