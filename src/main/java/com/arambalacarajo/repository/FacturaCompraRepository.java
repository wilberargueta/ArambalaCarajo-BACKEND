package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Compras;
import com.arambalacarajo.entity.FacturaCompra;
import com.arambalacarajo.entity.Facturas;

@Repository("facturaCompraRepository")
public interface FacturaCompraRepository extends JpaRepository<FacturaCompra, Integer> {

	public FacturaCompra findFacturaCompraByIdFacturaCompra(int idFacturaCompra);

	public FacturaCompra findFacturaCompraByFactura(Facturas factura);

	public FacturaCompra findFacturaCompraByCompra(Compras compra);

}
