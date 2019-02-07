package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Tarjeta;

@Repository("tarjetaRepository")
public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {

	public Tarjeta findTarjetaByIdTarjeta(int idTarjeta);

	public Tarjeta findTarjetaByNumeroTarjeta(String numTarjeta);
}
