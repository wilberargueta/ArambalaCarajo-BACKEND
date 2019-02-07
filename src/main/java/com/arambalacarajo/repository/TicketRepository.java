package com.arambalacarajo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Ticket;

@Repository("ticketRepository")
public interface TicketRepository extends JpaRepository<Ticket, String> {

	public Ticket findTicketByCodTicket(String codTicket);

	public List<Ticket> findTicketByFechaTicket(LocalDate fechaTicket);

	@Query("SELECT t FROM Ticket t WHERE t.fechaTicket BETWEEN :f1 AND :f2 ORDER BY t.fechaTicket")
	public List<Ticket> findTicketByFechas(LocalDate f1, LocalDate f2);

}
