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
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CategoriaRepository;

@RestController
public class CategoriaController {
	
	@Autowired
	@Qualifier("categoriaRepository")
	private CategoriaRepository cr;
	
	@CrossOrigin(origins="*")
	@RequestMapping(path="/api/categoria", method = RequestMethod.POST)
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		
		return cr.saveAndFlush(categoria);
	}
	
	
	@CrossOrigin(origins="*")
	@RequestMapping(path="/api/categoria/update", method = RequestMethod.POST)
	public Message updateCategoria(@RequestBody Categoria categoria) {
		cr.save(categoria);
		Message m = new Message();
		m.setMessage("Categoria Actualizada Correctamente");
		m.setStatus(HttpStatus.OK);
		return m;
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path="/api/categoria/delete", method = RequestMethod.POST)
	public Message deleteCategoria(@RequestBody Categoria categoria) {
		cr.delete(categoria);
		Message m = new Message();
		m.setMessage("Categoria Eliminada Correctamente");
		m.setStatus(HttpStatus.OK);
		return m;
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path="/api/categoria", method = RequestMethod.GET)
	public List<Categoria> getCategoria() {
	
		return cr.findCategorias();
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path="/api/categoria/{id}", method = RequestMethod.GET)
	public Categoria getCategoriaById(@PathVariable int id) {
	
		return cr.findCategoriaByIdCategoria(id);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(path="/api/categoria/cod/{cod}", method = RequestMethod.GET)
	public Categoria getCategoriaByCod(@PathVariable String cod) {
	
		return cr.findCategoriaByCodCategoria(cod);
	}
}
