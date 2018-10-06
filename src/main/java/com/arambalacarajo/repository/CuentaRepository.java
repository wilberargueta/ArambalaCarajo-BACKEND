package com.arambalacarajo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Cuenta;

@Repository("cuentaRepository")
public interface CuentaRepository extends JpaRepository<Cuenta, String>{
	
	public Cuenta findCuentaByIdCuenta(String idCuenta);
	public List<Cuenta> findCuentaByFechaCuenta(LocalDate fechaCuenta);


}
