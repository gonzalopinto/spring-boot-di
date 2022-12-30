package com.springboot.di.app.services;

import org.springframework.stereotype.Service;

//@Service("complexService")
public class MyServiceComplex implements IMyService {

	@Override
	public String operacion() {
		return "ejecutando proceso complejo...";
	}
}
