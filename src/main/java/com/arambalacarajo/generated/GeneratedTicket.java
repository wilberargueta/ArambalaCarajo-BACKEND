package com.arambalacarajo.generated;

import java.io.Serializable;
import java.util.Properties;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

public class GeneratedTicket implements IdentifierGenerator, Configurable {

	private String prefix;
	private String ceros;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String query = String.format("select %s from %s",
				session.getEntityPersister(object.getClass().getName(), object).getIdentifierPropertyName(),
				object.getClass().getSimpleName());

		Stream<String> ids = session.createQuery(query).stream();
		// ids.forEach(o -> LOGG.info(o));

		Long max = ids.map(o -> o.replace(prefix + "-", "")).mapToLong(Long::parseLong).max().orElse(0L);
		max += 1;
		if (max < 10) {
			ceros = "000000000";
		} else if (max < 100) {
			ceros = "00000000";
		} else if (max < 1000) {
			ceros = "0000000";
		} else if (max < 10000) {
			ceros = "000000";
		} else if (max < 100000) {
			ceros = "00000";
		} else if (max < 1000000) {
			ceros = "0000";
		} else if (max < 10000000) {
			ceros = "000";
		} else if (max < 100000000) {
			ceros = "00";
		} else if (max < 1000000000) {
			ceros = "0";
		} else {
			ceros = "";
		}

		return prefix + "-" + ceros + max;
	}

	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		this.prefix = params.getProperty("prefix");

	}

}
