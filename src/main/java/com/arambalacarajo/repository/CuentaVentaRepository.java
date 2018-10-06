package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.CuentaVenta;
import com.arambalacarajo.entity.Ventas;

@Repository("cuentaVentaRepository")
public interface CuentaVentaRepository extends JpaRepository<CuentaVenta, Integer>{
	
	public CuentaVenta findCuentaVentaByIdCuentaVenta(int idCuentaVenta);
	public CuentaVenta findCuentaVentaByCuenta(Cuenta cuenta);
	public CuentaVenta findCuentaVentaByVenta(Ventas venta);
}
