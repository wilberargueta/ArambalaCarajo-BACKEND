package com.arambalacarajo.service.imp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.Usuario;
import com.arambalacarajo.repository.CajaRepository;
import com.arambalacarajo.service.CajaService;

@Service("cajaService")
public class CajaServiceImp implements CajaService {

	@Autowired
	@Qualifier("cajaRepository")
	private CajaRepository persis;

	@Override
	public Caja save(Caja caja) {

		if (persis.existsCajaByAperturaCajaAndUsuario(LocalDate.now(), caja.getUsuario()))
			return persis.findCajaByAperturaCajaAndUsuario(LocalDate.now(), caja.getUsuario());
		else
			return persis.saveAndFlush(caja);
	}

	@Override
	public Caja update(Caja caja) {

		return persis.saveAndFlush(caja);
	}

	@Override
	public boolean delete(Caja caja) {

		if (persis.existsById(caja.getIdCaja()))
			persis.delete(caja);
		else
			return false;

		return true;
	}

	@Override
	public List<Caja> lista() {

		return persis.findAll();
	}

	@Override
	public Caja byId(int id) {

		return persis.findCajaByIdCaja(id);
	}

	@Override
	public List<Caja> byUsuario(Usuario u) {

		return persis.findCajaByUsuario(u);
	}

	@Override
	public Caja byAperturaAndUsuario(LocalDate apertura, Usuario u) {

		return persis.findCajaByAperturaCajaAndUsuario(apertura, u);
	}

}
