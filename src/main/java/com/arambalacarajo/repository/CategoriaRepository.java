package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Categoria;

@Repository("categoriaRepository")
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	public Categoria findCategoriaByIdCategoria(int id);
	public Categoria findCategoriaByCodCategoria(String cod);
	
	@Query("SELECT c FROM Categoria c order by c.idCategoria asc")
	public List<Categoria> findCategorias();
}
