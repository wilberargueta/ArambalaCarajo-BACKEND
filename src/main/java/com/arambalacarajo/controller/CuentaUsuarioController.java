package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.CuentaUsuario;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CuentaUsuarioRepository;

@RestController
@RequestMapping("/api/cuentaUsuario")
public class CuentaUsuarioController {

	@Autowired
	@Qualifier("cuentaUsuarioRepository")
	private CuentaUsuarioRepository cr;


	@PostMapping
	public CuentaUsuario addCuentaUsuario(@RequestBody CuentaUsuario c) {
		return this.cr.saveAndFlush(c);
	}

	@PostMapping("/update")
	public Message updateCuentaUsuario(@RequestBody CuentaUsuario c) {
		this.cr.save(c);
		return new Message(HttpStatus.OK, "CuentaUsuario Actualizada");
	}

	@PostMapping("/delete")
	public Message deleteCuentaUsuario(@RequestBody CuentaUsuario c) {
		this.cr.delete(c);
		return new Message(HttpStatus.OK, "CuentaUsuario eliminado");
	}

	@GetMapping
	public List<CuentaUsuario> getCuentaUsuario() {

		return this.cr.findAll();
	}
	
	@GetMapping("/{id}")
	public CuentaUsuario getCuentaUsuarioById(@PathVariable int id) {

		return this.cr.findCuentaUsuarioByIdCuentaUsuario(id);
	}
	
	
	@PostMapping("/usuario")
	public List<CuentaUsuario> getCuentaUsuarioByUsuario(@RequestBody Usuario usuario) {
			
		return this.cr.findCuentaUsuarioByUsuarioNow(usuario);
	}
	
	@PostMapping("/usuario/now")
	public List<CuentaUsuario> getCuentaUsuarioByUsuarioNow(@RequestBody Usuario usuario) {
			
		return this.cr.findCuentaUsuarioByUsuarioNow(usuario);
	}

	@PostMapping("/cuenta")
	public CuentaUsuario getCuentaUsuarioByCuenta(@RequestBody Cuenta cuenta) {

		return this.cr.findCuentaUsuarioByCuenta(cuenta);
	}

	@PostMapping("/cuenta/delete")
	public Message deleteCuentaUsuarioByCuenta(@RequestBody Cuenta c) {
		this.cr.deleteCuentaUsuarioByCuenta(c);
		return new Message(HttpStatus.OK, "CuentaUsuario eliminado");
	}

}
