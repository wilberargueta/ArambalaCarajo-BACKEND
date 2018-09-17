package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody MenuRecetasModel cp) {

		return cps.addMenuRecetas(cp);
	}

	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody MenuRecetasModel cp) {

		return cps.updateMenuRecetas(cp);
	}

	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody MenuRecetasModel cp) {

		return cps.deleteMenuRecetas(cp);
	}

	@RequestMapping(path = "/api/menuRecetas", method = RequestMethod.GET)
	public List<MenuRecetasModel> lista() {

		return cps.listaMenuRecetas();
	}

	@RequestMapping(path = "/api/menuRecetas/{id}", method = RequestMethod.GET)
	public MenuRecetasModel byId(@PathVariable int id) {

		return cps.findMenuRecetasById(id);
	}

	@RequestMapping(path = "/api/menuRecetas/menu", method = RequestMethod.GET)
	public List<MenuRecetasModel> byNum(@RequestBody MenusModel mm) {

		return cps.findMenuRecetaByMenu(mm);
	}
}
