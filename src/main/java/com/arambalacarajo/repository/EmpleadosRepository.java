package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Empleados;

@Repository("empleadosRepository")
public interface EmpleadosRepository extends JpaRepository<Empleados, Character> {

	public Empleados findEmpleadoByCodEmpleado(char[] codEmpleado);

}
