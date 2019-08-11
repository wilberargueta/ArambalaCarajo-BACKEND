package com.arambalacarajo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.Usuario;

@Repository("cajaRepository")
public interface CajaRepository extends JpaRepository<Caja, Integer>{
	public Caja findCajaByIdCaja(int idCaja);
	public List<Caja> findCajaByUsuario(Usuario usuario);
	public Caja findCajaByAperturaCajaAndUsuario(LocalDate aperturaCaja, Usuario usuario);
	public boolean existsCajaByAperturaCajaAndUsuario(LocalDate aperturaCaja, Usuario usuario);
	
}
