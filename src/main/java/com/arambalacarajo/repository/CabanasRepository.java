package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Cabanas;

@Repository("cabanasRepository")
public interface CabanasRepository extends JpaRepository<Cabanas, Character> {

	public Cabanas findCabañaByCodCabana(char[] codCabana);
	
	@Query("SELECT c FROM Cabanas c WHERE c.nombre LIKE  CONCAT('%',:nombre,'%')")
	public List<Cabanas> findCabanasByNombreStartingWith(String nombre);

}
