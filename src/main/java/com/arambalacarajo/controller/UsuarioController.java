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

import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.Respuesta;
import com.arambalacarajo.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	@Autowired
	@Qualifier("usuarioRepository")
	private UsuarioRepository ur;


	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuario", method = RequestMethod.POST)
	public Respuesta addUsuario(@RequestBody Usuario u) {
		Respuesta r;
		if (ur.existsUsuarioByNick(u.getNick())) {
			r = new Respuesta(new Message(HttpStatus.BAD_REQUEST, "El nick del usuario ya se encuentra duplicado"),
					null);
		} else if ((u.getNick() == null) || (u.getPass() == null)) {
			r = new Respuesta(new Message(HttpStatus.BAD_REQUEST, "No se permiten valores vacios"), null);
		} else {
			r = new Respuesta(new Message(HttpStatus.OK, "Usuario Agregado Correctamnte"), ur.saveAndFlush(u));
		}

		return r;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuario", method = RequestMethod.PUT)
	public Respuesta updateUsuario(@RequestBody Usuario u) {
		Respuesta r;
		if (ur.existsUsuarioByNick(u.getNick())) {
			r = new Respuesta(new Message(HttpStatus.BAD_REQUEST, "El nick del usuario ya se encuentra duplicado"),
					null);
		} else if ((u.getNick() == null) || (u.getPass() == null)) {
			r = new Respuesta(new Message(HttpStatus.BAD_REQUEST, "No se permiten valores vacios"), null);
		} else {
			r = new Respuesta(new Message(HttpStatus.OK, "Usuario actualizado Correctamnte"), ur.save(u));
		}

		return r;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuario/delete", method = RequestMethod.PUT)
	public Message deleteUsuario(@RequestBody Usuario u) {
		ur.delete(u);
		Message m = new Message(HttpStatus.OK, "Usuario Eliminado Correctamente");
		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuario", method = RequestMethod.GET)
	public List<Usuario> getUsuario() {

		return ur.findAll();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuario/nick/{nick}", method = RequestMethod.GET)
	public List<Usuario> getUsuarioByNick(@PathVariable String nick) {

		return ur.findUsuarioByNickContaining(nick);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuario/{nick}", method = RequestMethod.GET)
	public Usuario getUsuarioByNickBU(@PathVariable String nick) {

		return ur.findFirstUsuarioByNickContaining(nick);
	}

	
}
