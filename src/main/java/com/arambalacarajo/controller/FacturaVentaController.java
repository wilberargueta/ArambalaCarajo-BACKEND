package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.FacturaVentaModel;
import com.arambalacarajo.model.FacturasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.FacturaVentaService;

@RestController
public class FacturaVentaController {

	@Autowired
	@Qualifier("facturaVentaService")
	private FacturaVentaService cps;

	@RequestMapping(path = "/api/facturaVenta", method = RequestMethod.POST)
	public Message nuevo(@RequestBody FacturaVentaModel cp) {

		return cps.addFacturaVenta(cp);
	}

	@RequestMapping(path = "/api/facturaVenta/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody FacturaVentaModel cp) {

		return cps.updateFacturaVenta(cp);
	}

	@RequestMapping(path = "/api/facturaVenta/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody FacturaVentaModel cp) {

		return cps.deleteFacturaVenta(cp);
	}

	@RequestMapping(path = "/api/facturaVenta", method = RequestMethod.GET)
	public List<FacturaVentaModel> lista() {

		return cps.listaFacturaVenta();
	}

	@RequestMapping(path = "/api/facturaVenta/{id}", method = RequestMethod.GET)
	public FacturaVentaModel byId(@PathVariable int id) {

		return cps.findFacturaVentaById(id);
	}

	@RequestMapping(path = "/api/facturaVenta/factura", method = RequestMethod.GET)
	public List<FacturaVentaModel> byNum(@RequestBody FacturasModel f) {

		return cps.findFacturaVentaByFactura(f);
	}
}
