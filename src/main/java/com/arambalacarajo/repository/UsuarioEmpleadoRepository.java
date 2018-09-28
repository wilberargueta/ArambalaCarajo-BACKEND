package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Empleados;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.entity.UsuarioEmpleado;

@Repository("usuarioEmpleadoRepository")
public interface UsuarioEmpleadoRepository extends JpaRepository<UsuarioEmpleado, Integer> {
	
	public UsuarioEmpleado findUsuarioEmpleadoByIdUsuarioEmpleado(int id);
	public UsuarioEmpleado findUsuarioEmpleadoByEmpleado(Empleados empleado);
	public UsuarioEmpleado findUsuarioEmpleadoByUsuario(Usuario usuario);
}
