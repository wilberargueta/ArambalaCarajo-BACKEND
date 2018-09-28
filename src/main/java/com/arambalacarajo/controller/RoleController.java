package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.entity.Role;
import com.arambalacarajo.repository.RoleRepository;

@RestController
public class RoleController {

	@Autowired
	@Qualifier("roleRepository")
	private RoleRepository rr;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/role", method = RequestMethod.GET)
	public List<Role> getRole() {
		return rr.findAll();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/role/{id}", method = RequestMethod.GET)
	public Role getRoleById(@PathVariable int id) {
		return rr.findRoleByIdRole(id);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/role/busqueda/{role}", method = RequestMethod.GET)
	public List<Role> getRoleByRole(@PathVariable String role) {
		return rr.findRoleByRoleContaining(role);
	}
}
