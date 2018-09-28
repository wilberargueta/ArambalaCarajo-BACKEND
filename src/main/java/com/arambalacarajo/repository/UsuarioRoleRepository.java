package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Role;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.entity.UsuarioRole;

@Repository("usuarioRoleRepository")
public interface UsuarioRoleRepository extends JpaRepository<UsuarioRole, Integer> {
	public UsuarioRole findUsuarioRoleByIdUsuarioRole(int id);
	public UsuarioRole findUsuarioRoleByUsuario(Usuario usuario);
	public List<UsuarioRole> findUsuarioRoleByRole(Role role);
}
