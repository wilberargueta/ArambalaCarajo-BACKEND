package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.TipoPago;
import com.arambalacarajo.repository.TipoPagoRepository;

@RestController
public class TipoPagoController {
	
	@Autowired
	@Qualifier("tipoPagoRepository")
	private TipoPagoRepository tpr;
	
	
	@RequestMapping(path="/api/pagos", method=RequestMethod.GET)
	public List<TipoPago> getPagos() {
		return tpr.findAll();
	}
	@RequestMapping(path="/api/pagos/{id}", method=RequestMethod.GET)
	public TipoPago	 getPagoById(@PathVariable int id) {
		return tpr.findTipoPagoByIdTipoPago	(id);
	}
	
}
