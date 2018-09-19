package com.arambalacarajo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.MenusService;

@RestController
public class MenusController {

	@Autowired
	@Qualifier("menusService")
	private MenusService cps;
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/menus", method = RequestMethod.POST)
	public Message nuevo(@RequestBody MenusModel cp) {
		cp.setCreado(LocalDate.now());
		cp.setActualizado(LocalDate.now());
		cp.setActivo(true);
		return cps.addMenus(cp);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/menus", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody MenusModel cp) {

		return cps.updateMenus(cp);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/menus", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody MenusModel cp) {

		return cps.deleteMenus(cp);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/menus", method = RequestMethod.GET)
	public List<MenusModel> lista() {

		return cps.listaMenus();
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path = "/api/menus/{id}", method = RequestMethod.GET)
	public MenusModel byId(@PathVariable int id) {

		return cps.findMenusById(id);
	}

}
