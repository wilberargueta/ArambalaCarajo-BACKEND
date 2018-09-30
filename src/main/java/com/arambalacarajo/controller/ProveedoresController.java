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

import com.arambalacarajo.model.ProveedoresModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.ProveedoresService;

@RestController
public class ProveedoresController {

	@Autowired
	@Qualifier("proveedoresService")
	private ProveedoresService cps;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/proveedores", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ProveedoresModel cp) {
		cp.setCreado(LocalDate.now());
		cp.setActualizado(LocalDate.now());
		return cps.addProveedores(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/proveedores/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody ProveedoresModel cp) {
		cp.setActualizado(LocalDate.now());
		return cps.updateProveedores(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/proveedores/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody ProveedoresModel cp) {

		return cps.deleteProveedores(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/proveedores", method = RequestMethod.GET)
	public List<ProveedoresModel> lista() {

		return cps.listaProveedores();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/proveedores/{cod}", method = RequestMethod.GET)
	public ProveedoresModel byId(@PathVariable String cod) {

		return cps.findProveedoresByCod(cod.toCharArray());
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/proveedores/prefix/{prefix}", method = RequestMethod.GET)
	public List<ProveedoresModel> listaByPrefix(@PathVariable String prefix) {

		return cps.listaProveedoresByPrefix(prefix);
	}

}
