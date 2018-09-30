package com.arambalacarajo.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.ComprasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ProveedoresModel;
import com.arambalacarajo.service.ComprasService;

@RestController
public class ComprasController {

	@Autowired
	@Qualifier("comprasService")
	private ComprasService cps;
	

	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ComprasModel cp) {
		
		return cps.addCompra(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody ComprasModel cp) {

		return cps.updateCompra(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody ComprasModel cp) {

		return cps.deleteCompra(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras", method = RequestMethod.GET)
	public List<ComprasModel> lista() {

		return cps.listaCompras();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras/{id}", method = RequestMethod.GET)
	public ComprasModel byId(@PathVariable int id) {

		return cps.findCompraById(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras/registro/{reg}", method = RequestMethod.GET)
	public ComprasModel byRegistro(@PathVariable String reg) {

		return cps.findCompraByR(reg);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/compras/proveedor", method = RequestMethod.GET)
	public List<ComprasModel> byEmpleado(@RequestBody ProveedoresModel em) {

		return cps.listaByProveedor(em);
	}

}
