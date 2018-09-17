package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.MenuCabaña;

@Repository("menuCabañaRepository")
public interface MenuCabañaRepository extends JpaRepository<MenuCabaña, Integer> {

	public MenuCabaña findMenuCabañaByIdCabañaMenu(int idCabañaMenu);

}
