package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.TipoPago;

@Repository("tipoPagoRepository")
public interface TipoPagoRepository extends JpaRepository<TipoPago, Integer>{
		
	public TipoPago findTipoPagoByIdTipoPago(int idTipoPago);
}
