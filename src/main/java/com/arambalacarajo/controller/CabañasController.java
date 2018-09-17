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

import com.arambalacarajo.model.CabañasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.CabañasService;

@RestController
public class CabañasController {

	@Autowired
	@Qualifier("cabañasService")
	private CabañasService cs;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas", method = RequestMethod.GET)
	public List<CabañasModel> listaCabañas() {

		return cs.listaCabaña();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas/{cod}", method = RequestMethod.GET)
	public CabañasModel byCod(@PathVariable String cod) {

		return cs.findCompraByCod(cod);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody CabañasModel cm) {

		return cs.addCabaña(cm);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas", method = RequestMethod.PUT)
	public Message update(@RequestBody CabañasModel cm) {

		return cs.updateCabaña(cm);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/cabanas/{cod}", method = RequestMethod.DELETE)
	public Message delete(@PathVariable String cod) {
		CabañasModel cm = new CabañasModel();
		cm.setCodCabana(cod.toCharArray());
		return cs.deleteCabaña(cm);
	}
	
	
}
