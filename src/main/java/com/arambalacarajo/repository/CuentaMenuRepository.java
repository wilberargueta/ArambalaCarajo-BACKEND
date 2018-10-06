package com.arambalacarajo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.CuentaMenu;

@Repository("cuentaMenuRepository")
public interface CuentaMenuRepository extends JpaRepository<CuentaMenu, Integer> {
	
	public CuentaMenu findCuentaMenuByIdCuentaMenu(int idCuentaMenu);
	public List<CuentaMenu> findCuentaMenuByCuenta(Cuenta cuenta);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM CuentaMenu cm WHERE cm.cuenta = :cuenta")
	public void deleteCuentaMenuByCuenta(Cuenta cuenta);
}
