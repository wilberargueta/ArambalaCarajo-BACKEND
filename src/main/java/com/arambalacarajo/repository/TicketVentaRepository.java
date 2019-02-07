package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Ticket;
import com.arambalacarajo.entity.TicketVenta;
import com.arambalacarajo.entity.Ventas;

@Repository("ticketVentaRepository")
public interface TicketVentaRepository extends JpaRepository<TicketVenta, Integer>{
	
	public TicketVenta findTicketVentaByIdTicketVenta(int idTicketVenta);
	public TicketVenta findTicketVentaByTicket(Ticket ticket);
	public TicketVenta findTicketVentaByVenta(Ventas venta);
}
