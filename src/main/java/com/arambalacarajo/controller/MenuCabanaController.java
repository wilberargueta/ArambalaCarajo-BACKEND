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

import com.arambalacarajo.model.MenuCabanaModel;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.MenuCabanaService;

@RestController
public class MenuCabanaController {

	@Autowired
	@Qualifier("menuCabanaService")
	private MenuCabanaService ms;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana", method = RequestMethod.GET)
	public List<MenuCabanaModel> list() {
		return ms.listaMenuCabaña();
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana/menu", method = RequestMethod.PUT)
	public List<MenuCabanaModel> listByMenu(@RequestBody MenusModel mm) {
		return ms.listaMenuCabañaByMenu(mm);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana/{id}", method = RequestMethod.GET)
	public MenuCabanaModel byId(@PathVariable int id) {
		return ms.findCompraById(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana", method = RequestMethod.POST)
	public MenuCabanaModel nuevo(@RequestBody MenuCabanaModel mm) {
		return ms.addMenuCabaña(mm);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana", method = RequestMethod.PUT)
	public Message update(@RequestBody MenuCabanaModel mm) {
		return ms.updateMenuCabaña(mm);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana/delete", method = RequestMethod.PUT)
	public Message delete(@RequestBody MenuCabanaModel mm) {
		return ms.deleteMenuCabaña(mm);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCabana/delete/menu", method = RequestMethod.PUT)
	public Message delete(@RequestBody MenusModel mm) {
		return ms.deleteMenuCabañaByMenu(mm);
	}

}
