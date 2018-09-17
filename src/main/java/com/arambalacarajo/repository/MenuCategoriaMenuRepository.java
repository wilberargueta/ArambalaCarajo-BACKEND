package com.arambalacarajo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MenuCategoriaMenu;

@Repository("menuCategoriaMenuRepository")
public interface MenuCategoriaMenuRepository 
	extends JpaRepository<MenuCategoriaMenu, Integer>{
	}
