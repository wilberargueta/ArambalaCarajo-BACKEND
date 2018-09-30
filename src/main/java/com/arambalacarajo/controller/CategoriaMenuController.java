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

import com.arambalacarajo.entity.CategoriaMenu;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CategoriaMenuRepository;

@RestController
public class CategoriaMenuController {
	

	@Autowired
	@Qualifier("categoriaMenuRepository")
	private CategoriaMenuRepository categoriaMenuRepository;
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaMenu", method = RequestMethod.POST)
	public CategoriaMenu addCategoriaMenu(@RequestBody CategoriaMenu cm) {
		return categoriaMenuRepository.saveAndFlush(cm);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaMenu/update", method = RequestMethod.POST)
	public CategoriaMenu updateCategoriaMenu(@RequestBody CategoriaMenu cm) {
		return categoriaMenuRepository.saveAndFlush(cm);
	}
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaMenu/delete", method = RequestMethod.POST)
	public Message deleteCategoriaMenu(@RequestBody CategoriaMenu cm) {
		Message m = new Message();
		categoriaMenuRepository.delete(cm);
		m.setMessage("Categoria Eliminada...");
		m.setStatus(HttpStatus.OK);
		return m;
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaMenu", method = RequestMethod.GET)
	public List<CategoriaMenu> allCategoriaMenu() {
		return categoriaMenuRepository.findAll();
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaMenu/{id}", method = RequestMethod.GET)
	public CategoriaMenu getCategoriaMenuById(@PathVariable int id) {
		return categoriaMenuRepository.findCategoriaMenuByIdCategoriaMenu(id);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaMenu/busqueda/{categoriaMenu}", method = RequestMethod.GET)
	public List<CategoriaMenu> getCategoriaMenuBySearch(@PathVariable String categoriaMenu) {
		return categoriaMenuRepository.findCategoriaMenuByCategoriaMenuContaining(categoriaMenu);
	}
	
	
}
