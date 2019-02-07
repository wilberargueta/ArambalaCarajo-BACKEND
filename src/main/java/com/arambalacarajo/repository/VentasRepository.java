package com.arambalacarajo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arambalacarajo.entity.Ventas;

@Repository("ventasRepository")
public interface VentasRepository extends JpaRepository<Ventas, String> {

	public Ventas findVentasByRegistroVenta(String registroVenta);
	public List<Ventas> findVentasByFecha(LocalDate fecha);

}
