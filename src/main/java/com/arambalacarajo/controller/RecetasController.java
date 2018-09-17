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

import com.arambalacarajo.model.RecetasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.RecetasService;

@RestController
public class RecetasController {

	@Autowired
	@Qualifier("recetasService")
	private RecetasService cps;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetas", method = RequestMethod.POST)
	public RecetasModel nuevo(@RequestBody RecetasModel cp) {

		return cps.addRecetas(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody RecetasModel cp) {

		return cps.updateRecetas(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody RecetasModel cp) {

		return cps.deleteRecetas(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetas", method = RequestMethod.GET)
	public List<RecetasModel> lista() {

		return cps.listaRecetas();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetas/{id}", method = RequestMethod.GET)
	public RecetasModel byId(@PathVariable int id) {

		return cps.findRecetasById(id);
	}

}
