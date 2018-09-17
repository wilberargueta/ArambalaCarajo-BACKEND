package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.EmpleadoVentas;
import com.arambalacarajo.entity.Empleados;

@Repository("empleadoVentasRepository")
public interface EmpleadoVentasRepository extends JpaRepository<EmpleadoVentas, Integer> {

		public EmpleadoVentas findEmpleadoVentasByIdEmpleadoVenta(int idEmpleadoVenta);
		public List<EmpleadoVentas> findByEmpleado(Empleados empleado);
}
