package org.osgi.cdi.examples.component;

import java.util.Map;

import javax.enterprise.event.Observes;

import org.osgi.cdi.examples.Foo;
import org.osgi.service.cdi.annotations.Component;
import org.osgi.service.cdi.annotations.Greedy;
import org.osgi.service.cdi.reference.AddingEvent;

/*
 * Examples of multiple, dynamic, greedy references
 */

@Component
public class CE12 {

	void observeFoos(@Observes @Greedy AddingEvent<Foo> event) {
		Foo foo = event.getService();
		Map<String, ?> serviceProperties = event.getServiceProperties();
	}

}
