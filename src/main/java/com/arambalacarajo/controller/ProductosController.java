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

import com.arambalacarajo.model.ProductosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.ProductosService;

@RestController
public class ProductosController {

	@Autowired
	@Qualifier("productosService")
	private ProductosService cps;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/productos", method = RequestMethod.POST)
	public ProductosModel nuevo(@RequestBody ProductosModel cp) {
		cp.setActivo(true);
		cp.setActualizado(LocalDate.now());
		cp.setCreado(LocalDate.now());
		return cps.addProductos(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/productos/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody ProductosModel cp) {
		cp.setActualizado(LocalDate.now());
		return cps.updateProductos(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/productos/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody ProductosModel cp) {
		
		return cps.deleteProductos(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/productos", method = RequestMethod.GET)
	public List<ProductosModel> lista() {

		return cps.listaProductos();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/productos/{cod}", method = RequestMethod.GET)
	public ProductosModel byId(@PathVariable String cod) {

		return cps.findProductosByCod(cod);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/productos/nombre/{nombre}", method = RequestMethod.GET)
	public List<ProductosModel> listaByNombre(@PathVariable String nombre) {

		return cps.listaProductosByNombre(nombre);
	}

}
