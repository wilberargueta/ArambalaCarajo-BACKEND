package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.VentasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.VentasService;

@RestController
public class VentasController {

	@Autowired
	@Qualifier("ventasService")
	private VentasService cps;

	@RequestMapping(path = "/api/ventas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody VentasModel cp) {

		return cps.addVentas(cp);
	}

	@RequestMapping(path = "/api/ventas/update", method = RequestMethod.POST)
	public Message actualizar(@RequestBody VentasModel cp) {

		return cps.updateVentas(cp);
	}

	@RequestMapping(path = "/api/ventas/delete", method = RequestMethod.POST)
	public Message eliminar(@RequestBody VentasModel cp) {

		return cps.deleteVentas(cp);
	}

	@RequestMapping(path = "/api/ventas", method = RequestMethod.GET)
	public List<VentasModel> lista() {

		return cps.listaVentas();
	}

	@RequestMapping(path = "/api/ventas/{id}", method = RequestMethod.GET)
	public VentasModel byId(@PathVariable int id) {

		return cps.findVentasById(id);
	}

}
