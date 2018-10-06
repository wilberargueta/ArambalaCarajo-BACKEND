package com.arambalacarajo.generated;

import java.io.Serializable;
import java.util.Properties;
import java.util.stream.Stream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

public class GeneradorProducto implements IdentifierGenerator, Configurable {

	private String prefix;
	private String ceros;
	private Log LOGG = LogFactory.getLog(GeneradorProducto.class);

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String query = String.format("select %s from %s",
				session.getEntityPersister(object.getClass().getName(), object).getIdentifierPropertyName(),
				object.getClass().getSimpleName());

		Stream<String> ids = session.createQuery(query).stream();
		// ids.forEach(o -> LOGG.info(o));

		Long max = ids.map(o -> o.replace(prefix + "-", "")).mapToLong(Long::parseLong).max().orElse(0L);
		LOGG.info(max);
		if (max < 10) {
			ceros = "0000";
		} else if (max < 100) {
			ceros = "000";
		} else if (max < 1000) {
			ceros = "00";
		} else if (max < 10000) {
			ceros = "0";
		} else {
			ceros = "";
		}

		LOGG.info(prefix + "-" + ceros + (max + 1));
		return prefix + "-" + ceros + (max + 1);
	}

	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		this.prefix = params.getProperty("prefix");

	}

}
