package com.arambalacarajo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.model.CajaMultiValues;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CajaRepository;

@RestController
public class CajaController {

	@Autowired
	@Qualifier("cajaRepository")
	private CajaRepository cr;

	@RequestMapping(path = "/api/caja", method = RequestMethod.POST)
	public Caja addCaja(@RequestBody Caja caja) {

		return cr.saveAndFlush(caja);
	}

	@RequestMapping(path = "/api/caja/update", method = RequestMethod.POST)
	public Message updateCaja(@RequestBody Caja caja) {
		cr.save(caja);
		return new Message(HttpStatus.OK, "Caja Actualizada correctamente");
	}

	@RequestMapping(path = "/api/caja/delete", method = RequestMethod.POST)
	public Message deleteCaja(@RequestBody Caja caja) {
		cr.save(caja);
		return new Message(HttpStatus.OK, "Caja eliminada correctamente");
	}

	@RequestMapping(path = "/api/caja", method = RequestMethod.GET)
	public List<Caja> getCajas() {
		return this.cr.findAll();
	}

	@RequestMapping(path = "/api/caja/{id}", method = RequestMethod.GET)
	public Caja getCajas(@PathVariable int id) {
		return this.cr.findCajaByIdCaja(id);
	}

	@RequestMapping(path = "/api/caja/usuario", method = RequestMethod.POST)
	public List<Caja> getCajasByUsuario(@RequestBody Usuario usuario) {
		return this.cr.findCajaByUsuario(usuario);
	}

	@RequestMapping(path = "/api/caja/valores", method = RequestMethod.POST)
	public Caja getCajasByUsuario(@RequestBody CajaMultiValues values) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(values.getAperturaCaja(), formatter);
		return this.cr.findCajaByAperturaCajaAndUsuario(date, values.getUsuario());
	}
}
