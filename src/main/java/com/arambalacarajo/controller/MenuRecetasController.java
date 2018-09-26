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

import com.arambalacarajo.model.MenuRecetasModel;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.MenuRecetasService;

@RestController
public class MenuRecetasController {

	@Autowired
	@Qualifier("menuRecetasService")
	private MenuRecetasService cps;

	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.POST)
	public MenuRecetasModel nuevo(@RequestBody MenuRecetasModel cp) {

		return cps.addMenuRecetas(cp);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody MenuRecetasModel cp) {

		return cps.updateMenuRecetas(cp);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas/delete", method = RequestMethod.PUT)
	public Message eliminar(@RequestBody MenuRecetasModel cp) {

		return cps.deleteMenuRecetas(cp);
	}
	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas/delete/menu", method = RequestMethod.PUT)
	public Message eliminarByMenu(@RequestBody MenusModel mm) {

		return cps.deleteMenuRecetasByMenu(mm);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.GET)
	public List<MenuRecetasModel> lista() {

		return cps.listaMenuRecetas();
	}
	
	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas/{id}", method = RequestMethod.GET)
	public MenuRecetasModel byId(@PathVariable int id) {

		return cps.findMenuRecetasById(id);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path = "/api/menuRecetas/menu", method = RequestMethod.POST)
	public List<MenuRecetasModel> byNum(@RequestBody MenusModel mm) {

		return cps.findMenuRecetaByMenu(mm);
	}
}
