package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Empleados;

@Repository("empleadosRepository")
public interface EmpleadosRepository extends JpaRepository<Empleados, Character> {

	public Empleados findEmpleadoByCodEmpleado(char[] codEmpleado);
	public List<Empleados> findEmpleadoByNombreContaining(String nombre);


}
