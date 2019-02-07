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

import com.arambalacarajo.entity.Ticket;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.TicketRepository;

@RestController
public class TicketController {

	@Autowired
	@Qualifier("ticketRepository")
	private TicketRepository ticket;

	@RequestMapping(path = "/api/ticket", method = RequestMethod.POST)
	public Ticket addTicket(@RequestBody Ticket nuevo) {
		return this.ticket.saveAndFlush(nuevo);
	}

	@RequestMapping(path = "/api/ticket/update", method = RequestMethod.POST)
	public Ticket updateTicket(@RequestBody Ticket nuevo) {
		return this.ticket.saveAndFlush(nuevo);
	}

	@RequestMapping(path = "/api/ticket/delete", method = RequestMethod.POST)
	public Message deleteTicket(@RequestBody Ticket delete) {
		this.ticket.delete(delete);
		return new Message(HttpStatus.OK, "Ticket borrado correctamente");
	}

	@RequestMapping(path = "/api/ticket", method = RequestMethod.GET)
	public List<Ticket> getAllTicket() {
		return this.ticket.findAll();
	}

	@RequestMapping(path = "/api/ticket/cod/{cod}", method = RequestMethod.GET)
	public Ticket getTicketByCod(@PathVariable String cod) {
		return this.ticket.findTicketByCodTicket(cod);
	}

	@RequestMapping(path = "/api/ticket/fecha/{fecha}")
	public List<Ticket> getTicketByFecha(@PathVariable String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate d1 = LocalDate.parse(fecha, formatter);
		return this.ticket.findTicketByFechaTicket(d1);
	}

	@RequestMapping(path = "/api/ticket/fechas/{f1}/{f2}", method = RequestMethod.GET)
	public List<Ticket> findTicketByFechas(@PathVariable String f1, @PathVariable String f2) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate d1 = LocalDate.parse(f1, formatter);
		LocalDate d2 = LocalDate.parse(f2, formatter);

		return this.ticket.findTicketByFechas(d1, d2);
	}
}
