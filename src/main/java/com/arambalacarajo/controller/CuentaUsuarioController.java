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
import com.arambalacarajo.entity.CuentaUsuario;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CuentaUsuarioRepository;

@RestController
public class CuentaUsuarioController {

	@Autowired
	@Qualifier("cuentaUsuarioRepository")
	private CuentaUsuarioRepository cr;

	@RequestMapping(path = "/api/cuentaUsuario", method = RequestMethod.POST)
	public CuentaUsuario addCuentaUsuario(@RequestBody CuentaUsuario c) {
		return this.cr.saveAndFlush(c);
	}

	@RequestMapping(path = "/api/cuentaUsuario/update", method = RequestMethod.POST)
	public Message updateCuentaUsuario(@RequestBody CuentaUsuario c) {
		this.cr.save(c);
		return new Message(HttpStatus.OK, "CuentaUsuario Actualizada");
	}

	@RequestMapping(path = "/api/cuentaUsuario/delete", method = RequestMethod.POST)
	public Message deleteCuentaUsuario(@RequestBody CuentaUsuario c) {
		this.cr.delete(c);
		return new Message(HttpStatus.OK, "CuentaUsuario eliminado");
	}

	@RequestMapping(path = "/api/cuentaUsuario", method = RequestMethod.GET)
	public List<CuentaUsuario> getCuentaUsuario() {

		return this.cr.findAll();
	}

	@RequestMapping(path = "/api/cuentaUsuario/{id}", method = RequestMethod.GET)
	public CuentaUsuario getCuentaUsuarioById(@PathVariable int id) {

		return this.cr.findCuentaUsuarioByIdCuentaUsuario(id);
	}

	@RequestMapping(path = "/api/cuentaUsuario/usuario", method = RequestMethod.POST)
	public List<CuentaUsuario> getCuentaUsuarioByUsuario(@RequestBody Usuario usuario) {

		return this.cr.findCuentaUsuarioByUsuario(usuario);
	}

	@RequestMapping(path = "/api/cuentaUsuario/cuenta", method = RequestMethod.POST)
	public CuentaUsuario getCuentaUsuarioByCuenta(@RequestBody Cuenta cuenta) {

		return this.cr.findCuentaUsuarioByCuenta(cuenta);
	}
	
	@RequestMapping(path = "/api/cuentaUsuario/cuenta/delete", method = RequestMethod.POST)
	public Message deleteCuentaUsuarioByCuenta(@RequestBody Cuenta c) {
		this.cr.deleteCuentaUsuarioByCuenta(c);
		return new Message(HttpStatus.OK, "CuentaUsuario eliminado");
	}

}
