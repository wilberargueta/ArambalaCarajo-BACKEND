package com.arambalacarajo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.arambalacarajo.entity.Ventas;

@Repository("ventasRepository")
public interface VentasRepository extends JpaRepository<Ventas, String> {

	public Ventas findVentasByRegistroVenta(String registroVenta);
	public List<Ventas> findVentasByFecha(LocalDate fecha);
	@Query("SELECT v FROM Ventas v WHERE v.fecha BETWEEN :fecha1 AND :fecha2")
	public List<Ventas>findVentasBetween(LocalDate fecha1, LocalDate fecha2);

}
