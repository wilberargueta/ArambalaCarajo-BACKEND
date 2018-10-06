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

import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.CuentaVenta;
import com.arambalacarajo.entity.Ventas;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CuentaVentaRepository;

@RestController
public class CuentaVentaController {

	@Autowired
	@Qualifier("cuentaVentaRepository")
	private CuentaVentaRepository cr;

	@RequestMapping(path = "/api/cuentaVenta", method = RequestMethod.POST)
	public CuentaVenta addCuentaVenta(@RequestBody CuentaVenta c) {
		return this.cr.saveAndFlush(c);
	}

	@RequestMapping(path = "/api/cuentaVenta/update", method = RequestMethod.POST)
	public Message updateCuentaVenta(@RequestBody CuentaVenta c) {
		this.cr.save(c);
		return new Message(HttpStatus.OK, "CuentaVenta Actualizada");
	}

	@RequestMapping(path = "/api/cuentaVenta/delete", method = RequestMethod.POST)
	public Message deleteCuentaVenta(@RequestBody CuentaVenta c) {
		this.cr.delete(c);
		return new Message(HttpStatus.OK, "CuentaVenta eliminado");
	}

	@RequestMapping(path = "/api/cuentaVenta", method = RequestMethod.GET)
	public List<CuentaVenta> getCuentaVenta() {

		return this.cr.findAll();
	}

	@RequestMapping(path = "/api/cuentaVenta/{id}", method = RequestMethod.GET)
	public CuentaVenta getCuentaVentaById(@PathVariable int id) {

		return this.cr.findCuentaVentaByIdCuentaVenta(id);
	}

	@RequestMapping(path = "/api/cuentaVenta/venta", method = RequestMethod.POST)
	public CuentaVenta getCuentaVentaByVenta(@RequestBody Ventas venta) {

		return this.cr.findCuentaVentaByVenta(venta);
	}

	@RequestMapping(path = "/api/cuentaVenta/cuenta", method = RequestMethod.POST)
	public CuentaVenta getCuentaVentaByCuenta(@RequestBody Cuenta cuenta) {

		return this.cr.findCuentaVentaByCuenta(cuenta);
	}
}
