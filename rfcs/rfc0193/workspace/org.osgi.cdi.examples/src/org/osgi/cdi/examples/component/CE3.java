package org.osgi.cdi.examples.component;

import javax.enterprise.event.Observes;

import org.osgi.cdi.examples.Foo;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cdi.annotations.Component;
import org.osgi.service.cdi.reference.AddingEvent;

/*
 * Examples of multiple, dynamic, reluctant references
 */

@Component
public class CE3 {

	void observeFoos(@Observes AddingEvent<Foo> event) {
		ServiceReference<Foo> serviceReference = event.getServiceReference();
	}

}
