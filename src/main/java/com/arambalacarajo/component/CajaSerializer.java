package com.arambalacarajo.component;

import java.io.IOException;

import com.arambalacarajo.entity.Caja;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("rawtypes")
public class CajaSerializer extends StdSerializer<Caja> {

	protected CajaSerializer() {
		super(CajaSerializer.class, false);

	}

	@SuppressWarnings("unchecked")
	protected CajaSerializer(Class t) {
		super(t);
	}

	private static final long serialVersionUID = 2866917652995896063L;

	@Override
	public void serialize(Caja value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeNumberField("idCaja", value.getIdCaja());
		gen.writeObjectField("aperturaCaja", value.getAperturaCaja().toString());
		gen.writeObjectField("cierreCaja", value.getCierreCaja().toString());
		gen.writeStringField("montoApertura", value.getMontoApertura());
		gen.writeStringField("montoCierre", value.getMontoCierre());
		gen.writeBooleanField("cajaCerrada", value.isCajaCerrada());
		gen.writeObjectField("usuario", value.getUsuario());
		gen.writeEndObject();

	}

}
