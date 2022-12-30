package com.springboot.di.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service("simpleService")
public class MyService implements IMyService {

	@Override
	public String operacion() {
		return "ejecutando proceso simple...";
	}
}
