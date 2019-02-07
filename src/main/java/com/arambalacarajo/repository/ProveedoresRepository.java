package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arambalacarajo.entity.Proveedores;

@Repository("proveedoresRepository")
public interface ProveedoresRepository extends JpaRepository<Proveedores, String> {
	public Proveedores findProveedoresByCodProveedor(String codProveedor);
	public List<Proveedores> findProveedoresByRazonSocialContaining(String prefix);
}
