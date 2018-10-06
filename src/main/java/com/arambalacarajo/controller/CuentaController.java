package com.arambalacarajo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CuentaRepository;

@RestController
public class CuentaController {

	@Autowired
	@Qualifier("cuentaRepository")
	private CuentaRepository cr;
	
	private Log LOGGER = LogFactory.getLog(CuentaController.class);

	@RequestMapping(path = "/api/cuenta", method = RequestMethod.POST)
	public Cuenta addCuenta(@RequestBody Cuenta cuenta) {
		LOGGER.info(cuenta.toString());
		return this.cr.save(cuenta);
	}

	@RequestMapping(path = "/api/cuenta/update", method = RequestMethod.POST)
	public Message updateCuenta(@RequestBody Cuenta cuenta) {
		this.cr.save(cuenta);
		return new Message(HttpStatus.OK, "Cuenta Actualizada");
	}

	@RequestMapping(path = "/api/cuenta/delete", method = RequestMethod.POST)
	public Message deleteCuenta(@RequestBody Cuenta cuenta) {
		this.cr.delete(cuenta);
		return new Message(HttpStatus.OK, "Cuenta Eliminada");
	}

	@RequestMapping(path = "/api/cuenta", method = RequestMethod.GET)
	public List<Cuenta> getCuenta() {

		return this.cr.findAll();
	}

	@RequestMapping(path = "/api/cuenta/{id}", method = RequestMethod.GET)
	public Cuenta getCuentaById(@PathVariable String id) {

		return this.cr.findCuentaByIdCuenta(id);
	}

	@RequestMapping(path = "/api/cuenta/fecha/{fecha}", method = RequestMethod.GET)
	public List<Cuenta> getCuentaByFecha(@PathVariable String fecha) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(fecha, formatter);
		return this.cr.findCuentaByFechaCuenta(date);
	}
}
