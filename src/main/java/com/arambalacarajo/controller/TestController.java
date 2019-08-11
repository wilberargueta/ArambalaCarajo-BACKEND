package com.arambalacarajo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.repository.CuentaUsuarioRepository;

@RestController
public class TestController {

	@Autowired
	@Qualifier("cuentaUsuarioRepository")
	private CuentaUsuarioRepository user;

	private final Log LOG = LogFactory.getLog(TestController.class);

	@RequestMapping(path = "/test/uno", method = RequestMethod.GET)
	public void pruebaUno() {
		Usuario u = new Usuario();
		u.setIdUsuario(2);
		u.setNick("tomapedido");
		this.user.findCuentaUsuarioByUsuarioNow(u).forEach(cu -> {
			this.LOG.info("fecha::" + cu.getCuenta().getFechaCuenta());
		});
	}

}
