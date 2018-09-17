package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.FacturaVenta;
import com.arambalacarajo.entity.Facturas;

@Repository("facturaVentaRepository")
public interface FacturaVentaRepository extends JpaRepository<FacturaVenta, Integer> {

	public FacturaVenta findFacturaVentaByIdFacturaVenta(int idFacturaVenta);

	public List<FacturaVenta> findFacturaVentaByFactura(Facturas factura);

}
