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

import com.arambalacarajo.model.RecetaProductosModel;
import com.arambalacarajo.model.RecetasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.RecetaProductosService;

@RestController
public class RecetaProductosController {

	@Autowired
	@Qualifier("recetaProductosService")
	private RecetaProductosService cps;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos", method = RequestMethod.POST)
	public RecetaProductosModel nuevo(@RequestBody RecetaProductosModel cp) {

		return cps.addRecetaProductos(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody RecetaProductosModel cp) {

		return cps.updateRecetaProductos(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody RecetaProductosModel cp) {

		return cps.deleteRecetaProductos(cp);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos/delete/receta", method = RequestMethod.POST)
	public Message eliminarByReceta(@RequestBody RecetasModel cp) {

		return cps.deleteRecetaProductosByReceta(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos", method = RequestMethod.GET)
	public List<RecetaProductosModel> lista() {

		return cps.listaRecetaProductos();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos/{id}", method = RequestMethod.GET)
	public RecetaProductosModel byId(@PathVariable int id) {

		return cps.findRecetaProductosById(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/recetaProductos/receta", method = RequestMethod.POST)
	public List<RecetaProductosModel> byReceta(@RequestBody RecetasModel rm) {

		return cps.findRecetaProductosByReceta(rm);
	}

}
