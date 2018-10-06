package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Compras;
import com.arambalacarajo.entity.Proveedores;

@Repository("comprasRepository")
public interface ComprasRepository extends JpaRepository<Compras, Integer> {
	
	public Compras findCompraByIdCompra(int idCompra);
	public List<Compras> findComprasByProveedor(Proveedores proveedor);
	public Compras findCompraByRegistroCompra(String registro);

}
