package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Menus;

@Repository("menusRepository")
public interface MenusRepository extends JpaRepository<Menus, Integer> {

	public Menus findMenusByIdMenu(int idMenu);

}
