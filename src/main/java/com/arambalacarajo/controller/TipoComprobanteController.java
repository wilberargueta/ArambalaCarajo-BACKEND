package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.TipoComprobante;
import com.arambalacarajo.repository.TipoComprobanteRepository;

@RestController
public class TipoComprobanteController {

	@Autowired
	@Qualifier("tipoComprobanteRepository")
	private TipoComprobanteRepository tipoComprobante;

	@RequestMapping(method = RequestMethod.GET, path = "/api/tipocomprobante/{id}")
	public TipoComprobante getTipoFactura(@PathVariable int id) {

		return this.tipoComprobante.findTipoComprobanteByIdTipoComprobante(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/api/tipocomprobante")
	public List<TipoComprobante> getAllTipoFactua() {
		return this.tipoComprobante.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/api/tipocomprobante/comprobante/{c}")
	public TipoComprobante getTipoComprobanteByComprobante(@PathVariable String c) {
		return this.tipoComprobante.findTipoComprobanteByTipoComprobante(c);
	}
}
