package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Tarjeta;
import com.arambalacarajo.entity.VentaTarjeta;
import com.arambalacarajo.entity.Ventas;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.VentaTarjetaRepository;

@RestController
public class VentaTarjetaController {

	@Autowired
	@Qualifier("ventaTarjetaRepository")
	private VentaTarjetaRepository ventaTarjeta;

	@RequestMapping(path = "/api/ventatarjeta", method = RequestMethod.POST)
	public VentaTarjeta addVentaTarjeta(@RequestBody VentaTarjeta nueva) {
		return this.ventaTarjeta.saveAndFlush(nueva);
	}

	@RequestMapping(path = "/api/ventatarjeta/update", method = RequestMethod.POST)
	public VentaTarjeta updateVentaTarjeta(@RequestBody VentaTarjeta actualizar) {
		return this.ventaTarjeta.saveAndFlush(actualizar);
	}

	@RequestMapping(path = "/api/ventatarjeta/delete", method = RequestMethod.POST)
	public Message deleteVentaTarjeta(@RequestBody VentaTarjeta eliminar) {
		this.ventaTarjeta.saveAndFlush(eliminar);
		return new Message(HttpStatus.OK, "Eliminado...");
	}

	@RequestMapping(path = "/api/ventatarjeta", method = RequestMethod.GET)
	public List<VentaTarjeta> getAllVentaTarjeta() {
		return this.ventaTarjeta.findAll();
	}

	@RequestMapping(path = "/api/ventatarjeta/{id}", method = RequestMethod.GET)
	public VentaTarjeta getVentaTarjetaById(@PathVariable int id) {
		return this.ventaTarjeta.findVentaTarjetaByIdVentaTarjeta(id);
	}

	@RequestMapping(path = "/api/ventatarjeta/tarjeta", method = RequestMethod.POST)
	public List<VentaTarjeta> getVentaTarjetaByTarjeta(@RequestBody Tarjeta tarjeta) {
		return this.ventaTarjeta.findVentaTarjetaByTarjeta(tarjeta);
	}

	@RequestMapping(path = "/api/ventatarjeta/venta", method = RequestMethod.POST)
	public VentaTarjeta getVentaTarjetaByTarjeta(@RequestBody Ventas venta) {
		return this.ventaTarjeta.findVentaTarjetaByVenta(venta);
	}

}
