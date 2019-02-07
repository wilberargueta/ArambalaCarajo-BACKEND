package com.arambalacarajo.controller;

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
import com.arambalacarajo.entity.CuentaMenu;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CuentaMenuRepository;

@RestController
public class CuentaMenuController {

	Log LOG = LogFactory.getLog(CuentaMenuController.class);

	@Autowired
	@Qualifier("cuentaMenuRepository")
	private CuentaMenuRepository cr;

	@RequestMapping(path = "/api/cuentaMenu", method = RequestMethod.POST)
	public CuentaMenu addCuentaMenu(@RequestBody CuentaMenu c) {

		return this.cr.saveAndFlush(c);
	}

	@RequestMapping(path = "/api/cuentaMenu/all", method = RequestMethod.POST)
	public Message addCuentaMenuAll(@RequestBody List<CuentaMenu> cuentaMenu) {
		cuentaMenu.forEach(cm -> {
			cr.save(cm);
		});
		return new Message(HttpStatus.OK, "Cuenta agregada correctamente");
	}

	@RequestMapping(path = "/api/cuentaMenu/update", method = RequestMethod.POST)
	public Message updateCuentaMenu(@RequestBody CuentaMenu c) {
		this.cr.save(c);
		return new Message(HttpStatus.OK, "CuentaMenu Actualizada");
	}

	@RequestMapping(path = "/api/cuentaMenu/delete", method = RequestMethod.POST)
	public Message deleteCuentaMenu(@RequestBody CuentaMenu c) {
		this.cr.delete(c);
		return new Message(HttpStatus.OK, "CuentaMenu eliminado");
	}

	@RequestMapping(path = "/api/cuentaMenu", method = RequestMethod.GET)
	public List<CuentaMenu> getCuentaMenu() {

		return this.cr.findAll();
	}

	@RequestMapping(path = "/api/cuentaMenu/{id}", method = RequestMethod.GET)
	public CuentaMenu getCuentaMenuById(@PathVariable int id) {

		return this.cr.findCuentaMenuByIdCuentaMenu(id);
	}

	@RequestMapping(path = "/api/cuentaMenu/cuenta", method = RequestMethod.POST)
	public List<CuentaMenu> getCuentaMenuByCuenta(@RequestBody Cuenta cuenta) {

		return this.cr.findCuentaMenuByCuenta(cuenta);
	}

	@RequestMapping(path = "/api/cuentaMenu/cuenta/delete", method = RequestMethod.POST)
	public Message deleteCuentaMenuByCuenta(@RequestBody Cuenta cuenta) {
		this.cr.deleteCuentaMenuByCuenta(cuenta);
		return new Message(HttpStatus.OK, "CuentaMenu eliminado");
	}

}
