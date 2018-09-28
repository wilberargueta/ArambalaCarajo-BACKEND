package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.CategoriaMenu;


@Repository("categoriaMenuRepository")
public interface CategoriaMenuRepository extends JpaRepository<CategoriaMenu, Integer> {
	public CategoriaMenu findCategoriaMenuByIdCategoriaMenu(int id);
	//@Query("SELECT cm FROM CategoriaMenu cm WHERE cm.categoriaMenu LIKE  CONCAT('%',:categoriaMenu,'%')")
	public List<CategoriaMenu> findCategoriaMenuByCategoriaMenuContaining(String categoriaMenu);
}
