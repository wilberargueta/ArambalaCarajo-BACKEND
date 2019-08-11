package com.arambalacarajo.service;

import java.time.LocalDate;
import java.util.List;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.Usuario;

public interface CajaService {
	
	public Caja save(Caja caja);
	public Caja update(Caja caja);
	public boolean delete(Caja caja);
	public List<Caja> lista();
	public Caja byId(int id);
	public List<Caja> byUsuario(Usuario u);
	public Caja byAperturaAndUsuario(LocalDate apertura, Usuario u);
}
