package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.entity.UsuarioRole;
import com.arambalacarajo.repository.UsuarioEmpleadoRepository;
import com.arambalacarajo.repository.UsuarioRepository;
import com.arambalacarajo.repository.UsuarioRoleRepository;

@Service("loginServiceImp")
public class LoginServiceImp implements UserDetailsService {

	@Autowired
	@Qualifier("usuarioRepository")
	private UsuarioRepository ur;

	@Autowired
	@Qualifier("usuarioRoleRepository")
	private UsuarioRoleRepository urr;

	@Autowired
	@Qualifier("usuarioEmpleadoRepository")
	private UsuarioEmpleadoRepository ue;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = ur.findFirstUsuarioByNickContaining(username);
		UsuarioRole role = urr.findUsuarioRoleByUsuario(user);

		return this.userBuilder(user.getNick(), user.getPass(), role.getRole().getRole());
	}

	private User userBuilder(String username, String password, String role) {

		boolean enable = true;
		boolean accountNonExpired = true;
		boolean credentialNonExpired = true;
		boolean accountNonLocked = true;
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
		return new User(username,new BCryptPasswordEncoder().encode(password), enable, accountNonExpired,
				credentialNonExpired, accountNonLocked, authorities);
	}

}
