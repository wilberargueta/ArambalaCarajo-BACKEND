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

import com.arambalacarajo.entity.CategoriaProducto;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CategoriaProductoRepository;

@RestController
public class CategoriaProductoController {
	
	@Autowired
	@Qualifier("categoriaProductoRepository")
	private CategoriaProductoRepository categoriaProductoRepository;
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaProducto", method = RequestMethod.POST)
	public CategoriaProducto addCategoriaProducto(@RequestBody CategoriaProducto cm) {
		return categoriaProductoRepository.saveAndFlush(cm);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaProducto", method = RequestMethod.PUT)
	public CategoriaProducto updateCategoriaProducto(@RequestBody CategoriaProducto cm) {
		return categoriaProductoRepository.saveAndFlush(cm);
	}
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaProducto/delete", method = RequestMethod.PUT)
	public Message deleteCategoriaProducto(@RequestBody CategoriaProducto cm) {
		Message m = new Message();
		categoriaProductoRepository.delete(cm);
		m.setMessage("Categoria Eliminada...");
		m.setStatus(HttpStatus.OK);
		return m;
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaProducto", method = RequestMethod.GET)
	public List<CategoriaProducto> allCategoriaProducto() {
		return categoriaProductoRepository.findAll();
	}
	@CrossOrigin("*")
	@RequestMapping(path="/api/categoriaProducto/{id}", method = RequestMethod.GET)
	public CategoriaProducto getCategoriaProductoById(@PathVariable int id) {
		return categoriaProductoRepository.findCategoriaProductoByIdCategoriaProducto(id);
	}
}
