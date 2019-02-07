package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MedidaProducto;

@Repository("medidaProductoRepository")
public interface MedidaProductoRepository extends JpaRepository<MedidaProducto, Integer> {
	public MedidaProducto findMedidaProductoByIdMedidaProducto(int idMedidaProducto);
}
