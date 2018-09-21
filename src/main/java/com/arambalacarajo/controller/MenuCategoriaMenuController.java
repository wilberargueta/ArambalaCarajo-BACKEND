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

import com.arambalacarajo.entity.MenuCategoriaMenu;
import com.arambalacarajo.entity.Menus;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenuCategoriaMenuRepository;

@RestController
public class MenuCategoriaMenuController {
	
	@Autowired
	@Qualifier("menuCategoriaMenuRepository")
	private MenuCategoriaMenuRepository menuCategoriaMenuRepository;
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/menuCategoriaMenu", method = RequestMethod.POST)
	public MenuCategoriaMenu addMenuCategoriaMenu(@RequestBody MenuCategoriaMenu cm) {
		return menuCategoriaMenuRepository.saveAndFlush(cm);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/menuCategoriaMenu", method = RequestMethod.PUT)
	public MenuCategoriaMenu updateMenuCategoriaMenu(@RequestBody MenuCategoriaMenu cm) {
		return menuCategoriaMenuRepository.saveAndFlush(cm);
	}
	@CrossOrigin("*")
	@RequestMapping(path="/api/menuCategoriaMenu/delete", method = RequestMethod.PUT)
	public Message deleteMenuCategoriaMenu(@RequestBody MenuCategoriaMenu cm) {
		Message m = new Message();
		menuCategoriaMenuRepository.delete(cm);
		m.setMessage("Categoria Eliminada...");
		m.setStatus(HttpStatus.OK);
		return m;
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/menuCategoriaMenu", method = RequestMethod.GET)
	public List<MenuCategoriaMenu> allMenuCategoriaMenu() {
		return menuCategoriaMenuRepository.findAll();
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/menuCategoriaMenu/menu", method = RequestMethod.POST)
	public MenuCategoriaMenu categoriaMenuByMenu(@RequestBody Menus menu) {
		return menuCategoriaMenuRepository.findMenuCategoriaMenuByMenu(menu);
	}
	
}
