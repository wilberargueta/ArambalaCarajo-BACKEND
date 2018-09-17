package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arambalacarajo.entity.Recetas;

@Repository("recetasRepository")
public interface RecetasRepository extends JpaRepository<Recetas, Integer> {
	
	public Recetas findRecetaByIdReceta(int idReceta);

}
