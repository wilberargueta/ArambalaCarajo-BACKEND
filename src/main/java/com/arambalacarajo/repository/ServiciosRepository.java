package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Servicios;

@Repository("serviciosRepository")
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

	public Servicios findServicioByIdServicio(int idServicio);
	
	//@Query("SELECT s FROM Servicios s WHERE s.nombre LIKE  CONCAT('%',:nombre,'%')")
	public List<Servicios> findServiciosByNombreContaining(String nombre);

}
