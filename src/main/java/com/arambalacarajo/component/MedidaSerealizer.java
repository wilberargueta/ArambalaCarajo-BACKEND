package com.arambalacarajo.component;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.arambalacarajo.entity.Medidas;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("rawtypes")
public class MedidaSerealizer extends StdSerializer {

	private static final long serialVersionUID = 1L;
	
	private final Log LOGGER = LogFactory.getLog(MedidaSerealizer.class);

	@SuppressWarnings("unchecked")
	public MedidaSerealizer() {
		super(Medidas.class);

	}

	@SuppressWarnings("unchecked")
	public MedidaSerealizer(Class t) {
		super(t);

	}

	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		this.LOGGER.info("Serialicer Medida");
		gen.writeStartObject();
		gen.writeObjectField("medida", Medidas.getMedida((String) value).getName());
		gen.writeEndObject();
	}

}
