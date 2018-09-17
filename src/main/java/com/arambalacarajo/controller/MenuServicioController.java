package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.arambalacarajo.model.MenuServicioModel;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.MenuServicioService;

@RestController
public class MenuServicioController {

	@Autowired
	@Qualifier("menuServicioService")
	private MenuServicioService ms;

	@RequestMapping(path = "/api/menuServicio", method = RequestMethod.GET)
	public List<MenuServicioModel> listaMenuServicios() {

		return ms.listaMenuServicio();
	}

	@RequestMapping(path = "/api/menuServicio/{id}", method = RequestMethod.GET)
	public MenuServicioModel byId(@PathVariable int id) {

		return ms.findMenuServicioById(id);
	}

	@RequestMapping(path = "/api/menuServicio", method = RequestMethod.POST)
	public Message nuevo(@RequestBody MenuServicioModel cm) {

		return ms.addMenuServicio(cm);
	}

	@RequestMapping(path = "/api/menuServicio", method = RequestMethod.PUT)
	public Message update(@RequestBody MenuServicioModel cm) {

		return ms.updateMenuServicio(cm);
	}

	@RequestMapping(path = "/api/menuServicio", method = RequestMethod.DELETE)
	public Message delete(@RequestBody MenuServicioModel cm) {

		return ms.deleteMenuServicio(cm);
	}

	@RequestMapping(path = "/api/menuServicio/menu", method = RequestMethod.GET)
	public List<MenuServicioModel> byMenu(@RequestBody MenusModel mm) {

		return ms.listaByMenu(mm);
	}
}
