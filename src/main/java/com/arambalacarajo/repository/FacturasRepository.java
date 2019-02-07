package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Facturas;
import com.arambalacarajo.entity.TipoComprobante;

@Repository("facturasRepository")
public interface FacturasRepository extends JpaRepository<Facturas, Integer> {

	public Facturas findFacturaByIdFactura(int idFactura);

	public Facturas findFacturaByNumFactura(String numFactura);

	public List<Facturas> findFacturasByTipoComprobante
	(TipoComprobante tipoComprobante);

}
