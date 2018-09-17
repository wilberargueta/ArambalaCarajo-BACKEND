package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Servicios;

@Repository("serviciosRepository")
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

	public Servicios findServicioByIdServicio(int idServicio);

}
