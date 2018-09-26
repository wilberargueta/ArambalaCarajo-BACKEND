package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Categoria;

@Repository("categoriaRepository")
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	public Categoria findCategoriaByIdCategoria(int id);
	public Categoria findCategoriaByCodCategoria(String cod);
}
