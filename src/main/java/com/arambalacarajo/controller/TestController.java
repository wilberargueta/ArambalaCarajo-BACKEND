package com.arambalacarajo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.service.ProductosService;

@RestController
public class TestController {

	@Autowired
	@Qualifier("productosService")
	private ProductosService prod;

	private final Log LOG = LogFactory.getLog(TestController.class);

	@RequestMapping(path = "/test/uno", method = RequestMethod.GET)
	public void pruebaUno() {
		this.LOG.info(this.prod.listaActivos().size());
	}

	@RequestMapping(path = "/test/dos", method = RequestMethod.GET)
	public void pruebaDos() {
		this.LOG.info(this.prod.listaProductos().size());
	}

}
