package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Productos;

@Repository("productosRepository")
public interface ProductosRepository extends JpaRepository<Productos, String> {
	
	public Productos findProductosByCodProducto(String codProducto);
	//@Query("SELECT p FROM Productos p WHERE p.nombre LIKE  CONCAT('%',:nombre,'%')")
	public List<Productos> findProductosByNombreContaining(String nombre);

}
