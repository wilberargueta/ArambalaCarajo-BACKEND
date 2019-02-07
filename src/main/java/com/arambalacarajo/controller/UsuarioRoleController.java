package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Role;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.entity.UsuarioRole;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.UsuarioRoleRepository;

@RestController
public class UsuarioRoleController {

	@Autowired
	@Qualifier("usuarioRoleRepository")
	private UsuarioRoleRepository urr;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole", method = RequestMethod.POST)
	public UsuarioRole addUsuarioRole(@RequestBody UsuarioRole ur) {
		UsuarioRole uRT = urr.saveAndFlush(ur);
		uRT.getUsuario().setPass("");
		return uRT;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole/update", method = RequestMethod.POST)
	public Message updateUsuarioRole(@RequestBody UsuarioRole ur) {
		urr.save(ur);
		Message m = new Message(HttpStatus.OK, "UsuarioRole Actualizado");
		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole/delete", method = RequestMethod.POST)
	public Message deleteUsuarioRole(@RequestBody UsuarioRole ur) {
		urr.delete(ur);
		Message m = new Message(HttpStatus.OK, "UsuarioRole Eliminado");
		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole", method = RequestMethod.GET)
	public List<UsuarioRole> getUsuarioRole() {

		return urr.findAll();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole/{id}", method = RequestMethod.GET)
	public UsuarioRole getUsuarioRoleById(@PathVariable int id) {
		UsuarioRole uRT = urr.findUsuarioRoleByIdUsuarioRole(id);
		uRT.getUsuario().setPass("");
		return uRT;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole/usuario", method = RequestMethod.POST)
	public UsuarioRole getUsuarioRoleByUsuario(@RequestBody Usuario ur) {
		UsuarioRole uRT = urr.findUsuarioRoleByUsuario(ur)	;
		uRT.getUsuario().setPass("");
		return uRT;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioRole/role", method = RequestMethod.POST)
	public List<UsuarioRole> getUsuarioRoleByRole(@RequestBody Role r) {

		return urr.findUsuarioRoleByRole(r);
	}
}
