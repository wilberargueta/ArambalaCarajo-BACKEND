package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.CategoriaProducto;

@Repository("categoriaProductoRepository")
public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Integer> {
	public CategoriaProducto findCategoriaProductoByIdCategoriaProducto(int id);
}
