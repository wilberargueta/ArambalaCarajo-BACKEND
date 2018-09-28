package com.arambalacarajo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
		
	public Usuario findUsuarioByIdUsuario(int idUsuario);
	
	//@Query("SELECT u FROM Usuario u WHERE u.nick LIKE CONCAT('%',:nick,'%')")
	public List<Usuario> findUsuarioByNickContaining(String nick);	
	public boolean existsUsuarioByNick(String nick);
	
	//@Query("SELECT u FROM Usuario u WHERE u.nick LIKE CONCAT('%',:nick,'%')")
	public Usuario findFirstUsuarioByNickContaining(String nick);
	
}
