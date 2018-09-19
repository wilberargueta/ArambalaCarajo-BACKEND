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

import com.arambalacarajo.entity.ProductoCategoriaProducto;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.ProductoCategoriaProductoRepository;


public class ProductoCategoriaProductoController {
	@Autowired
	@Qualifier("productoCategoriaProductoRepository")
	private ProductoCategoriaProductoRepository productoCategoriaProductoRepository;
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/productoCategoriaProducto", method = RequestMethod.POST)
	public ProductoCategoriaProducto addProductoCategoriaProducto(@RequestBody ProductoCategoriaProducto cm) {
		return productoCategoriaProductoRepository.saveAndFlush(cm);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/productoCategoriaProducto", method = RequestMethod.PUT)
	public ProductoCategoriaProducto updateProductoCategoriaProducto(@RequestBody ProductoCategoriaProducto cm) {
		return productoCategoriaProductoRepository.saveAndFlush(cm);
	}
	@CrossOrigin("*")
	@RequestMapping(path="/api/productoCategoriaProducto/delete", method = RequestMethod.PUT)
	public Message deleteProductoCategoriaProducto(@RequestBody ProductoCategoriaProducto cm) {
		Message m = new Message();
		productoCategoriaProductoRepository.delete(cm);
		m.setMessage("Categoria Eliminada...");
		m.setStatus(HttpStatus.OK);
		return m;
	}
	@CrossOrigin("*")
	@RequestMapping(path="/api/productoCategoriaProducto/{id}", method = RequestMethod.GET)
	public ProductoCategoriaProducto getProductoCategoriaProductoById(@PathVariable int id) {
		return productoCategoriaProductoRepository
				.findProductoCategoriaProductoByIdProductoCategoriaProducto(id);
	}
	
	@CrossOrigin("*")
	@RequestMapping(path="/api/productoCategoriaProducto", method = RequestMethod.GET)
	public List<ProductoCategoriaProducto> allProductoCategoriaProducto() {
		return productoCategoriaProductoRepository.findAll();
	}
	
}
