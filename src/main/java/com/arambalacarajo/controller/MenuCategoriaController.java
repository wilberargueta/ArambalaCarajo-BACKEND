package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Categoria;
import com.arambalacarajo.entity.MenuCategoria;
import com.arambalacarajo.entity.Menus;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenuCategoriaRepository;

@RestController
public class MenuCategoriaController {
	@Autowired
	@Qualifier("menuCategoriaRepository")
	private MenuCategoriaRepository mcr;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCategoria", method = RequestMethod.POST)
	public MenuCategoria addMenuCategoria(@RequestBody MenuCategoria mc) {

		return mcr.saveAndFlush(mc);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCategoria/update", method = RequestMethod.POST)
	public Message updateMenuCategoria(@RequestBody MenuCategoria mc) {
		mcr.save(mc);
		Message m = new Message();
		m.setStatus(HttpStatus.OK);
		m.setMessage("Categoria Actualizada Correctamente..");
		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCategoria/delete", method = RequestMethod.POST)
	public Message deleteMenuCategoria(@RequestBody MenuCategoria mc) {
		mcr.delete(mc);
		Message m = new Message();
		m.setStatus(HttpStatus.OK);
		m.setMessage("Categoria Eliminada Correctamente..");
		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCategoria", method = RequestMethod.GET)
	public List<MenuCategoria> getMenuCategoria() {

		return mcr.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCategoria/busqueda/categoria", method = RequestMethod.POST)
	public List<MenuCategoria> getMenuCategoriaByCategoria(@RequestBody Categoria categoria) {

		return mcr.findMenuCategoriaByCategoria(categoria);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/menuCategoria/{id}", method = RequestMethod.GET)
	public MenuCategoria getMenuCategoriaByCategoria(@PathVariable int id) {

		return mcr.findMenuCategoriaByIdMenuCategoria(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path ="/api/menuCategoria/menu/{id}", method = RequestMethod.POST)
	public MenuCategoria getMenuCategoriaByCategoriaAndMenu(@PathVariable int id, @RequestBody Menus menu) {
		Categoria c = new Categoria();
		c.setIdCategoria(id);

		return mcr.findMenuCategoriaByCategoriaAndMenu(c, menu);
	}

}
