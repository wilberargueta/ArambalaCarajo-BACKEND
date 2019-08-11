package com.arambalacarajo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.model.CajaMultiValues;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.CajaService;

@RestController
@RequestMapping("/api/caja")
public class CajaController {

	@Autowired
	@Qualifier("cajaService")
	private CajaService service;

	@PostMapping
	public Caja addCaja(@RequestBody Caja caja) {

		return service.save(caja);
	}

	@PostMapping("/update")
	public Caja updateCaja(@RequestBody Caja caja) {

		return service.update(caja);
	}

	@PostMapping("/delete")
	public Message deleteCaja(@RequestBody Caja caja) {
		if (service.delete(caja))
			return new Message(HttpStatus.OK, "Eliminado correctamente.");
		else
			return new Message(HttpStatus.BAD_REQUEST, "Error en el registro");
	}

	@GetMapping
	public List<Caja> getCajas() {
		return service.lista();
	}

	@GetMapping("/{id}")
	public Caja getCajas(@PathVariable int id) {
		return service.byId(id);
	}

	@PostMapping("/usuario")
	public List<Caja> getCajasByUsuario(@RequestBody Usuario usuario) {
		return service.byUsuario(usuario);
	}

	@PostMapping("/valores")
	public Caja getCajasByUsuario(@RequestBody CajaMultiValues values) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(values.getAperturaCaja(), formatter);
		return service.byAperturaAndUsuario(date, values.getUsuario());
	}
}
