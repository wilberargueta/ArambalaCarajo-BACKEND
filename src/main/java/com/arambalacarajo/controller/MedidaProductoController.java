package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.MedidaProducto;
import com.arambalacarajo.repository.MedidaProductoRepository;


@RestController
public class MedidaProductoController {

	@Autowired
	@Qualifier("medidaProductoRepository")
	private MedidaProductoRepository mpr;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/medidaProducto", method = RequestMethod.GET)
	public List<MedidaProducto> getMedidaProducto() {
		return this.mpr.findAll();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/medidaProducto/{id}", method = RequestMethod.GET)
	public MedidaProducto getMedidaProductoById(@PathVariable int id) {
		return this.mpr.findMedidaProductoByIdMedidaProducto(id);
	}

}
