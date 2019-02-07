package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.CajaVenta;
import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.Ventas;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CajaVentaRepository;

@RestController
public class CajaVentaController {

	@Autowired
	@Qualifier("cajaVentaRepository")
	private CajaVentaRepository cr;

	@RequestMapping(path = "/api/cajaVenta", method = RequestMethod.POST)
	public CajaVenta addCajaVenta(@RequestBody CajaVenta cajaventa) {
		return cr.saveAndFlush(cajaventa);
	}

	@RequestMapping(path = "/api/cajaVenta/update", method = RequestMethod.POST)
	public Message updateCajaVenta(@RequestBody CajaVenta cajaventa) {
		cr.save(cajaventa);
		return new Message(HttpStatus.OK, "CajaVenta actualizada");
	}

	@RequestMapping(path = "/api/cajaVenta/delete", method = RequestMethod.POST)
	public Message deleteCajaVenta(@RequestBody CajaVenta cajaventa) {
		cr.save(cajaventa);
		return new Message(HttpStatus.OK, "CajaVenta eliminado");
	}

	@RequestMapping(path = "/api/cajaVenta", method = RequestMethod.GET)
	public List<CajaVenta> getCajaVenta() {

		return cr.findAll();
	}

	@RequestMapping(path = "/api/cajaVenta/{id}", method = RequestMethod.GET)
	public CajaVenta getCajaVentaById(@PathVariable int id) {

		return cr.findCajaVentaByIdCajaVenta(id);
	}

	@RequestMapping(path = "/api/cajaVenta/caja", method = RequestMethod.POST)
	public List<CajaVenta> getCajaVentaByCaja(@RequestBody Caja caja) {

		return cr.findCajaVentaByCaja(caja);
	}

	@RequestMapping(path = "/api/cajaVenta/cuenta", method = RequestMethod.POST)
	public CajaVenta getCajaVentaByCuenta(@RequestBody Cuenta cuenta) {

		return cr.findCajaVentaByCuenta(cuenta);
	}

	@RequestMapping(path = "/api/cajaVenta/venta", method = RequestMethod.POST)
	public CajaVenta getCajaVentaByVenta(@RequestBody Ventas venta) {

		return cr.findCajaVentaByVenta(venta);
	}
}
