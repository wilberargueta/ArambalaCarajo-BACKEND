package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Categoria;
import com.arambalacarajo.entity.MenuCategoria;
import com.arambalacarajo.entity.Menus;

@Repository("menuCategoriaRepository")
public interface MenuCategoriaRepository extends JpaRepository<MenuCategoria, Integer>{
		
	public List<MenuCategoria> findMenuCategoriaByCategoria(Categoria categoria);
	public MenuCategoria findMenuCategoriaByIdMenuCategoria(int id);
	public MenuCategoria findMenuCategoriaByCategoriaAndMenu(Categoria categoria, Menus menu);
}
