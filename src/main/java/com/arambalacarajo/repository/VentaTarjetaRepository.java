package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Tarjeta;
import com.arambalacarajo.entity.VentaTarjeta;
import com.arambalacarajo.entity.Ventas;

@Repository("ventaTarjetaRepository")
public interface VentaTarjetaRepository extends JpaRepository<VentaTarjeta, Integer> {

	public VentaTarjeta findVentaTarjetaByIdVentaTarjeta(int idVentaTarjeta);

	public VentaTarjeta findVentaTarjetaByVenta(Ventas venta);

	public List<VentaTarjeta> findVentaTarjetaByTarjeta(Tarjeta tarjeta);
}
