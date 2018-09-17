package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.MenuCabañaModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.MenuCabañaService;

@RestController
public class MenuCabañaController {

	@Autowired
	@Qualifier("menuCabañaService")
	private MenuCabañaService ms;

	@RequestMapping(path = "/api/menuCabaña", method = RequestMethod.GET)
	public List<MenuCabañaModel> list() {
		return ms.listaMenuCabaña();
	}

	@RequestMapping(path = "/api/menuCabaña/{id}", method = RequestMethod.GET)
	public MenuCabañaModel byId(@PathVariable int id) {
		return ms.findCompraById(id);
	}

	@RequestMapping(path = "/api/menuCabaña", method = RequestMethod.POST)
	public Message nuevo(@RequestBody MenuCabañaModel mm) {
		return ms.addMenuCabaña(mm);
	}

	@RequestMapping(path = "/api/menuCabaña", method = RequestMethod.PUT)
	public Message update(@RequestBody MenuCabañaModel mm) {
		return ms.updateMenuCabaña(mm);
	}

	@RequestMapping(path = "/api/menuCabaña", method = RequestMethod.DELETE)
	public Message delete(@RequestBody MenuCabañaModel mm) {
		return ms.deleteMenuCabaña(mm);
	}

}
