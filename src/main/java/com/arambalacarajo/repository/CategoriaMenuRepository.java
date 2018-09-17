package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.CategoriaMenu;

@Repository("categoriaMenuRepository")
public interface CategoriaMenuRepository extends JpaRepository<CategoriaMenu, Integer> {
	public CategoriaMenu findCategoriaMenuByIdCategoriaMenu(int id);
}
