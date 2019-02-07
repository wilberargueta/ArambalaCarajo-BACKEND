package com.arambalacarajo.repository;

import com.arambalacarajo.entity.TipoComprobante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tipoComprobanteRepository")
public interface TipoComprobanteRepository extends JpaRepository<TipoComprobante, Integer> {

	public TipoComprobante findTipoComprobanteByIdTipoComprobante(int idTipoComprobante);

	public TipoComprobante findTipoComprobanteByTipoComprobante(String tipoComprobante);
}