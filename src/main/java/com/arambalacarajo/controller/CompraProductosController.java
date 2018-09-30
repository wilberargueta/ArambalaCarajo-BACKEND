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

import com.arambalacarajo.model.CompraProductosModel;
import com.arambalacarajo.model.ComprasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.CompraProductosService;

@RestController
public class CompraProductosController {

	@Autowired
	@Qualifier("compraProductosService")
	private CompraProductosService cps;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto", method = RequestMethod.POST)
	public CompraProductosModel nuevo(@RequestBody CompraProductosModel cp) {

		return cps.addCompraProducto(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody CompraProductosModel cp) {

		return cps.updateCompraProducto(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody CompraProductosModel cp) {
		
		return cps.deleteCompraProducto(cp);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto/delete/compra", method = RequestMethod.POST)
	public Message eliminarByCompra(@RequestBody ComprasModel cp) {
		
		return cps.deleteCompraProductoByCompra(cp);
	}


	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto", method = RequestMethod.GET)
	public List<CompraProductosModel> lista() {

		return cps.listaCompraProductos();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto/{id}", method = RequestMethod.GET)
	public CompraProductosModel byId(@PathVariable int id) {

		return cps.findCompraProductosById(id);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compraProducto/compras", method = RequestMethod.POST)
	public List<CompraProductosModel> byCompra(@RequestBody ComprasModel c) {

		return cps.listaByCompra(c);
	}
	


}
