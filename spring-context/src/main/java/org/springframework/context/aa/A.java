package org.springframework.context.aa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	private B propertyB;

	public B getPropertyB() {
		return propertyB;
	}

	public void setPropertyB(B propertyB) {
		this.propertyB = propertyB;
	}
}
