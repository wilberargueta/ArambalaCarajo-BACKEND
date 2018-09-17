package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MenuServicio;
import com.arambalacarajo.entity.Menus;

@Repository("menuServicioRepository")
public interface MenuServicioRepository extends JpaRepository<MenuServicio, Integer> {

	public MenuServicio findMenuServicioByIdMenuServicio(int idMenuServicio);

	public List<MenuServicio> findMenuServicioByMenu(Menus menu);
	
	

}
