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
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.TarjetaRepository;

@RestController
public class TarjetaController {

	@Autowired
	@Qualifier("tarjetaRepository")
	private TarjetaRepository tr;

	@RequestMapping(path = "/api/tarjeta", method = RequestMethod.POST)
	public Tarjeta addTarjeta(@RequestBody Tarjeta nueva) {
		return this.tr.saveAndFlush(nueva);
	}

	@RequestMapping(path = "/api/tarjeta/update", method = RequestMethod.POST)
	public Tarjeta updateTarjeta(@RequestBody Tarjeta nueva) {
		return this.tr.saveAndFlush(nueva);
	}

	@RequestMapping(path = "/api/tarjeta/delete", method = RequestMethod.POST)
	public Message deleteTarjeta(@RequestBody Tarjeta nueva) {
		this.tr.delete(nueva);
		return new Message(HttpStatus.OK, "Tarjeta borrada correctamente..");
	}

	@RequestMapping(path = "/api/tarjeta", method = RequestMethod.GET)
	public List<Tarjeta> getAllTarjetas() {
		return this.tr.findAll();
	}

	@RequestMapping(path = "/api/tarjeta/{id}", method = RequestMethod.GET)
	public Tarjeta getTarjetaById(@PathVariable int id) {
		return this.tr.findTarjetaByIdTarjeta(id);
	}

	@RequestMapping(path = "/api/tarjeta/numero", method = RequestMethod.POST)
	public Tarjeta getTarjetaByNumero(@RequestBody Tarjeta id) {
		return this.tr.findTarjetaByNumeroTarjeta(id.getNumeroTarjeta());
	}

}
