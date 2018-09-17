package com.arambalacarajo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.CompraProductos;
import com.arambalacarajo.entity.Compras;


@Repository("compraProductosRepository")
public interface CompraProductosRepository extends JpaRepository<CompraProductos, Integer> {

	public CompraProductos findCompraByidCompraProducto(int idCompraProducto);

	public List<CompraProductos> findByCompras(Compras compras);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM CompraProductos cp WHERE cp.compras = :compra")
	public void deleteCompraProductosByCompras(Compras compra);
	
	
}
