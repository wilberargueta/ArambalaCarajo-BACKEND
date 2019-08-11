package com.arambalacarajo.component;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.arambalacarajo.entity.Productos;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("rawtypes")
public class ProductosSerializer extends StdSerializer<Productos>{
	
	private final Log LOGGER = LogFactory.getLog(ProductosSerializer.class);
	
	private ProductosSerializer() {
		super(ProductosSerializer.class, false);
	}

	@SuppressWarnings("unchecked")
	protected ProductosSerializer(Class t) {
		super(t);

	}

	private static final long serialVersionUID = 1L;

	@Override
	public void serialize(Productos value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		this.LOGGER.info("Serialicer Producto");
		gen.writeStartObject();
		gen.writeStringField("codProducto", value.getCodProducto());
		gen.writeStringField("nombre", value.getNombre());
		gen.writeBooleanField("activo", value.isActivo());
		gen.writeObjectField("creado", value.getCreado());
		gen.writeObjectField("actualizado", value.getActualizado());
		gen.writeObjectField("eliminado", value.getEliminado());
		gen.writeObjectField("medida", value.getMedida());
		gen.writeEndObject();
		
	}
	

}
