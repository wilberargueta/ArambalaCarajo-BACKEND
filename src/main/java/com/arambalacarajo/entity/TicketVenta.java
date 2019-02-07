package com.arambalacarajo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_venta")
public class TicketVenta {

	@Id
	@GeneratedValue
	@Column(name = "id_ticket_venta")
	private int idTicketVenta;

	@OneToOne
	@JoinColumn(name = "cod_ticket")
	private Ticket ticket;

	@OneToOne
	@JoinColumn(name = "id_venta")
	private Ventas venta;

	public TicketVenta() {
	}

	public TicketVenta(int idTicketVenta, Ticket ticket, Ventas venta) {
		this.idTicketVenta = idTicketVenta;
		this.ticket = ticket;
		this.venta = venta;
	}

	public int getIdTicketVenta() {
		return idTicketVenta;
	}

	public void setIdTicketVenta(int idTicketVenta) {
		this.idTicketVenta = idTicketVenta;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "TicketVenta [idTicketVenta=" + idTicketVenta + ", ticket=" + ticket + ", venta=" + venta + "]";
	}

}
