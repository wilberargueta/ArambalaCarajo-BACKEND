package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.VentaMenus;
import com.arambalacarajo.entity.Ventas;

@Repository("ventaMenusRepository")
public interface VentaMenusRepository extends JpaRepository<VentaMenus, Integer> {
	
	public VentaMenus findVentaMenusByIdVentaMenu(int idVentaMenu);
	
	public List<VentaMenus> findVentaMenusByVenta(Ventas venta);

}
