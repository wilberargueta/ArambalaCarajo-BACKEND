package com.arambalacarajo.component;

import java.io.IOException;



import com.arambalacarajo.entity.Cuenta;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("rawtypes")
public class CuentaSerializer extends StdSerializer<Cuenta> {

	//private final Log LOGGER = LogFactory.getLog(CuentaSerializer.class);

	private CuentaSerializer() {
		super(CuentaSerializer.class, false);
	}

	@SuppressWarnings("unchecked")
	protected CuentaSerializer(Class t) {
		super(t);

	}

	private static final long serialVersionUID = 1L;

	@Override
	public void serialize(Cuenta value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeStringField("idCuenta", value.getIdCuenta());
		gen.writeObjectField("fechaCuenta", value.getFechaCuenta().toString());
		gen.writeStringField("descuento", value.getDescuento());
		gen.writeStringField("nombre", value.getNombre());
		gen.writeNumberField("mesa", value.getMesa());
		gen.writeBooleanField("cobrada", value.isCobrada());
		gen.writeBooleanField("cobrable", value.isCobrable());
		gen.writeEndObject();

	}

}
