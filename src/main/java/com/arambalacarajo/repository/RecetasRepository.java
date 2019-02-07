package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arambalacarajo.entity.Recetas;

@Repository("recetasRepository")
public interface RecetasRepository extends JpaRepository<Recetas, Integer> {
	
	public Recetas findRecetaByIdReceta(int idReceta);
	
	//@Query("SELECT r FROM Recetas r WHERE r.nombre LIKE  CONCAT('%',:nombre,'%')")
	public List<Recetas> findRecetasByNombreContaining(String nombre);
}
