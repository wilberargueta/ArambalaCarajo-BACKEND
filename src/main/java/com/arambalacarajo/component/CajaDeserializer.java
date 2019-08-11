package com.arambalacarajo.component;

import java.io.IOException;
import java.time.LocalDate;

import com.arambalacarajo.entity.Caja;
import com.arambalacarajo.entity.Usuario;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CajaDeserializer extends StdDeserializer<Caja> {

	private CajaDeserializer() {
		this(null);

	}

	private CajaDeserializer(Class<?> vc) {
		super(vc);

	}

	private static final long serialVersionUID = 1939803534686780914L;

	@Override
	public Caja deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		TreeNode node = p.readValueAsTree();
		Caja caja = new Caja();
		Usuario usuario = new Usuario();

		if (node.get("idCaja") != null && node.get("idCaja").toString() != "null")
			caja.setIdCaja(Integer.parseInt(node.get("idCaja").toString()));

		if (node.get("cierreCaja") != null)
			caja.setCierreCaja(LocalDate.parse(node.get("cierreCaja").toString().replace("\"", "")));

		if (node.get("aperturaCaja") != null)
			caja.setAperturaCaja(LocalDate.parse(node.get("aperturaCaja").toString().replace("\"", "")));

		if (node.get("montoApertura") != null)
			caja.setMontoApertura(node.get("montoApertura").toString().replace("\"", ""));

		if (node.get("montoCierre") != null)
			caja.setMontoCierre(node.get("montoCierre").toString().replace("\"", ""));

		if (node.get("usuario") != null && node.get("usuario").get("idUsuario") != null)
			usuario.setIdUsuario(Integer.parseInt(node.get("usuario").get("idUsuario").toString()));

		if (node.get("cajaCerrada") != null)
			caja.setCajaCerrada(Boolean.parseBoolean(node.get("cajaCerrada").toString()));
		caja.setUsuario(usuario);

		return caja;
	}

}
