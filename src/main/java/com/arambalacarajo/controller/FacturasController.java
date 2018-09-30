package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.FacturasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.FacturasService;

@RestController
public class FacturasController {

	@Autowired
	@Qualifier("facturasService")
	private FacturasService cps;

	@RequestMapping(path = "/api/facturas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody FacturasModel cp) {

		return cps.addFacturas(cp);
	}

	@RequestMapping(path = "/api/facturas/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody FacturasModel cp) {

		return cps.updateFacturas(cp);
	}

	@RequestMapping(path = "/api/facturas/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody FacturasModel cp) {

		return cps.deleteFacturas(cp);
	}

	@RequestMapping(path = "/api/facturas", method = RequestMethod.GET)
	public List<FacturasModel> lista() {

		return cps.listaFacturas();
	}

	@RequestMapping(path = "/api/facturas/{id}", method = RequestMethod.GET)
	public FacturasModel byId(@PathVariable int id) {

		return cps.findFacturasById(id);
	}

	@RequestMapping(path = "/api/facturas/numero/{num}", method = RequestMethod.GET)
	public FacturasModel byNum(@PathVariable String num) {

		return cps.findFacturaByNumFactura(num.toCharArray());
	}
}
