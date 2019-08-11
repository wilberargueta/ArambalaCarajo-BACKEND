package com.arambalacarajo.component;

import java.io.IOException;
import java.time.LocalDate;

import com.arambalacarajo.entity.Cuenta;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CuentaDeserializer extends StdDeserializer<Cuenta> {


	public CuentaDeserializer() {
		this(null);
	}

	public CuentaDeserializer(Class<?> vc) {
		super(vc);

	}

	private static final long serialVersionUID = -6577894552767089366L;

	@Override
	public Cuenta deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);
		String idCuenta = node.get("idCuenta").asText();
		LocalDate fechaCuenta = LocalDate.parse(node.get("fechaCuenta").asText());
		String descuento = node.get("descuento").asText();
		String nombre = node.get("nombre").asText();
		int mesa = node.get("mesa").asInt();
		boolean cobrada = node.get("cobrada").asBoolean();
		boolean cobrable = node.get("cobrable").asBoolean();

		return new Cuenta(idCuenta, fechaCuenta, descuento, nombre, mesa, cobrada, cobrable);
	}

}
