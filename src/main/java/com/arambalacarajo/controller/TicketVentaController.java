package com.arambalacarajo.controller;

import java.time.LocalDate;
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
import com.arambalacarajo.entity.TicketVenta;
import com.arambalacarajo.entity.Ventas;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.TicketRepository;
import com.arambalacarajo.repository.TicketVentaRepository;

@RestController
public class TicketVentaController {

	@Autowired
	@Qualifier("ticketVentaRepository")
	private TicketVentaRepository tvr;
	@Autowired
	@Qualifier("ticketRepository")
	private TicketRepository tr;

	@RequestMapping(path = "/api/ticketventa", method = RequestMethod.POST)
	public TicketVenta addTicketVenta(@RequestBody TicketVenta nuevo) {
		Ticket t = nuevo.getTicket();
		t.setFechaTicket(LocalDate.now());
		nuevo.setTicket(tr.saveAndFlush(t));
		return this.tvr.saveAndFlush(nuevo);
	}

	@RequestMapping(path = "/api/ticketventa/update", method = RequestMethod.POST)
	public TicketVenta updateTicketVenta(@RequestBody TicketVenta actualizar) {
		return this.tvr.saveAndFlush(actualizar);
	}

	@RequestMapping(path = "/api/ticketventa/delete", method = RequestMethod.POST)
	public Message deleteTicketVenta(@RequestBody TicketVenta eliminar) {
		this.tvr.delete(eliminar);
		return new Message(HttpStatus.OK, "Eliminado..");
	}

	@RequestMapping(path = "/api/ticketventa", method = RequestMethod.GET)
	public List<TicketVenta> getAllTicketVenta() {
		return this.tvr.findAll();
	}

	@RequestMapping(path = "/api/ticketventa/{id}", method = RequestMethod.GET)
	public TicketVenta getTicketVentaByid(@PathVariable int id) {
		return this.tvr.findTicketVentaByIdTicketVenta(id);
	}

	@RequestMapping(path = "/api/ticketventa/venta", method = RequestMethod.POST)
	public TicketVenta getTicketVentaByVenta(@RequestBody Ventas venta) {
		return this.tvr.findTicketVentaByVenta(venta);
	}

	@RequestMapping(path = "/api/ticketventa/ticket", method = RequestMethod.POST)
	public TicketVenta getTicketVentaByTicket(@RequestBody Ticket ticket) {
		return this.tvr.findTicketVentaByTicket(ticket);
	}
}
