package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Facturas;

@Repository("facturasRepository")
public interface FacturasRepository extends JpaRepository<Facturas, Integer> {

	public Facturas findFacturaByIdFactura(int idFactura);

	public Facturas findFacturaByNumFactura(char[] numFactura);

}
