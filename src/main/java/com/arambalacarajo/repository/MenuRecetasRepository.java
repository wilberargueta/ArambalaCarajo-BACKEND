package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MenuRecetas;
import com.arambalacarajo.entity.Menus;

@Repository("menuRecetasRepository")
public interface MenuRecetasRepository extends JpaRepository<MenuRecetas, Integer> {

	public MenuRecetas findMenuRecetaByIdMenuReceta(int idMenuReceta);

	public List<MenuRecetas> findMenuRecetaByMenu(Menus menu);

}
