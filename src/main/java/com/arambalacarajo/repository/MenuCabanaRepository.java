package com.arambalacarajo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MenuCabana;
import com.arambalacarajo.entity.Menus;


@Repository("menuCabanaRepository")
public interface MenuCabanaRepository extends JpaRepository<MenuCabana, Integer> {

	public MenuCabana findMenuCabanaByIdCabanaMenu(int idCabanaMenu);
	public List<MenuCabana> findMenuCabañaByMenu(Menus menu);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM MenuCabana mc WHERE mc.menu = :menu")
	public void deleteMenuCabanaByMenu(Menus menu);
	


}
