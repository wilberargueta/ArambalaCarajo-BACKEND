package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arambalacarajo.entity.Ventas;

@Repository("ventasRepository")
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

	public Ventas findVentasByIdVenta(int idVenta);

}
