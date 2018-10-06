package com.arambalacarajo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Cuenta;
import com.arambalacarajo.entity.CuentaUsuario;
import com.arambalacarajo.entity.Usuario;

@Repository("cuentaUsuarioRepository")
public interface CuentaUsuarioRepository extends JpaRepository<CuentaUsuario, Integer> {

	public CuentaUsuario findCuentaUsuarioByIdCuentaUsuario(int idCuentaUsuario);

	public List<CuentaUsuario> findCuentaUsuarioByUsuario(Usuario usuario);

	public CuentaUsuario findCuentaUsuarioByCuenta(Cuenta cuenta);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM CuentaUsuario cu WHERE cu.cuenta = :cuenta")
	public void deleteCuentaUsuarioByCuenta(Cuenta cuenta);
	
}
