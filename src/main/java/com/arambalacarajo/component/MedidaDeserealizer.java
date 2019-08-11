package com.arambalacarajo.component;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.arambalacarajo.entity.Medidas;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class MedidaDeserealizer extends StdDeserializer<String> {

	private final Log LOGGER = LogFactory.getLog(MedidaSerealizer.class);

	protected MedidaDeserealizer() {
		this(null);

	}

	protected MedidaDeserealizer(Class<?> vc) {
		super(vc);

	}

	private static final long serialVersionUID = 1L;

	@Override
	public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		this.LOGGER.info("Deserealizando..");
		JsonNode node = p.getCodec().readTree(p);

		String medida = Medidas.getMedida(node.get("medida").textValue()).getName();

		return medida;
	}

}
