package com.arambalacarajo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(generator = "prod-generator")
	@GenericGenerator(name = "prod-generator", parameters = @Parameter(name = "prefix", value = "T"), strategy = "com.arambalacarajo.generated.GeneratedTicket")
	@Column(name = "cod_ticket", unique = true)
	private String codTicket;

	@Column(name = "fecha_ticket", columnDefinition="DATE")
	private LocalDate fechaTicket;

	public Ticket() {
	}

	public Ticket(String codTicket, LocalDate fechaTicket) {
		this.codTicket = codTicket;
		this.fechaTicket = fechaTicket;
	}

	public String getCodTicket() {
		return codTicket;
	}

	public void setCodTicket(String codTicket) {
		this.codTicket = codTicket;
	}

	public LocalDate getFechaTicket() {
		return fechaTicket;
	}

	public void setFechaTicket(LocalDate fechaTicket) {
		this.fechaTicket = fechaTicket;
	}

	@Override
	public String toString() {
		return "Ticket [codTicket=" + codTicket + ", fechaTicket=" + fechaTicket + "]";
	}

}
