package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.CabanasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.CabanasService;

@RestController
public class CabanasController {

	@Autowired
	@Qualifier("cabanasService")
	private CabanasService cs;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas", method = RequestMethod.GET)
	public List<CabanasModel> listaCabañas() {

		return cs.listaCabaña();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas/{cod}", method = RequestMethod.GET)
	public CabanasModel byCod(@PathVariable String cod) {

		return cs.findCabañaByCod(cod);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas/busqueda/{nombre}", method = RequestMethod.GET)
	public List<CabanasModel> byNombre(@PathVariable String nombre) {

		return cs.listaCabañaByNombre(nombre);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas", method = RequestMethod.POST)
	public CabanasModel nuevo(@RequestBody CabanasModel cm) {

		return cs.addCabaña(cm);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas/update", method = RequestMethod.POST)
	public Message update(@RequestBody CabanasModel cm) {

		return cs.updateCabaña(cm);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas/delete", method = RequestMethod.POST)
	public Message delete(@RequestBody CabanasModel c) {

		return cs.deleteCabaña(c);
	}
	
	
}
