package org.springframework.context.aa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	A propertyA;

	public A getPropertyA() {
		return propertyA;
	}

	public void setPropertyA(A propertyA) {
		this.propertyA = propertyA;
	}
}
