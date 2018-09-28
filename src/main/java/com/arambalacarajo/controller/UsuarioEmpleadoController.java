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

import com.arambalacarajo.entity.Empleados;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.entity.UsuarioEmpleado;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.UsuarioEmpleadoRepository;

@RestController
public class UsuarioEmpleadoController {

	@Autowired
	@Qualifier("usuarioEmpleadoRepository")
	private UsuarioEmpleadoRepository uer;
	


	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado", method = RequestMethod.POST)
	public UsuarioEmpleado addUsuarioEmpleado(@RequestBody UsuarioEmpleado ue) {

	

		return uer.saveAndFlush(ue);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado", method = RequestMethod.PUT)
	public Message updateUsuarioEmpleado(@RequestBody UsuarioEmpleado ue) {
		Message m = new Message(HttpStatus.OK, "Usuario Actualizado");
		try {
			uer.save(ue);
			m = new Message(HttpStatus.OK, "Usuario Actualizado");
		} catch (Exception e) {
			m.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
			m.setMessage("Usuario duplicado");
		}

		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado/delete", method = RequestMethod.PUT)
	public Message deleteUsuarioEmpleado(@RequestBody UsuarioEmpleado ue) {
		uer.delete(ue);
		Message m = new Message(HttpStatus.OK, "Usuario Eliminado");
		return m;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado", method = RequestMethod.GET)
	public List<UsuarioEmpleado> getUsuarioEmpleado() {

		return uer.findAll();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado/usuario", method = RequestMethod.PUT)
	public UsuarioEmpleado getUsuarioEmpleadoByUsuario(@RequestBody Usuario u) {

		return uer.findUsuarioEmpleadoByUsuario(u);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado/empleados", method = RequestMethod.PUT)
	public UsuarioEmpleado getUsuarioEmpleadoByUsuario(@RequestBody Empleados e) {

		return uer.findUsuarioEmpleadoByEmpleado(e);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/usuarioEmpleado/{id}", method = RequestMethod.GET)
	public UsuarioEmpleado getUsuarioEmpleadoById(@PathVariable int id) {

		return uer.findUsuarioEmpleadoByIdUsuarioEmpleado(id);
	}

}
