package com.arambalacarajo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MenuServicio;
import com.arambalacarajo.entity.Menus;

@Repository("menuServicioRepository")
public interface MenuServicioRepository extends JpaRepository<MenuServicio, Integer> {

	public MenuServicio findMenuServicioByIdMenuServicio(int idMenuServicio);

	public List<MenuServicio> findMenuServicioByMenu(Menus menu);

	@Transactional
	@Modifying
	@Query("DELETE FROM MenuServicio ms WHERE ms.menu = :menu")
	public void deleteMenuServicioByMenu(Menus menu);

}
