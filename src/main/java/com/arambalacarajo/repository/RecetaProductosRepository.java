package com.arambalacarajo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.RecetaProductos;
import com.arambalacarajo.entity.Recetas;

@Repository("recetaProductosRepository")
public interface RecetaProductosRepository extends JpaRepository<RecetaProductos, Integer> {
	public RecetaProductos findRecetaProductosByIdRecetaProducto(int idRecetaProducto);

	public List<RecetaProductos> findRecetaProductosByReceta(Recetas receta);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM RecetaProductos rp WHERE rp.receta = :receta")
	public void deleteRecetaProductosByReceta(Recetas receta);
}
