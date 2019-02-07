package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.CajaVenta;
import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.Ventas;

@Repository("cajaVentaRepository")
public interface CajaVentaRepository extends JpaRepository<CajaVenta, Integer>{
	
	public CajaVenta findCajaVentaByIdCajaVenta(int idCajaVenta);
	public CajaVenta findCajaVentaByCuenta(Cuenta cuenta);
	public List<CajaVenta> findCajaVentaByCaja(Caja caja);
	public CajaVenta findCajaVentaByVenta(Ventas venta);
}
