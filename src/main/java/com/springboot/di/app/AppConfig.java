package com.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.di.app.models.domain.ItemFactura;
import com.springboot.di.app.models.domain.Producto;
import com.springboot.di.app.services.IMyService;
import com.springboot.di.app.services.MyService;
import com.springboot.di.app.services.MyServiceComplex;

@Configuration
public class AppConfig {

	@Bean("simpleService")
	public IMyService registrarServicio() {
		return new MyService();
	}

	@Bean("complexService")
	@Primary
	public IMyService registrarServicioComplejo() {
		return new MyServiceComplex();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto p1 = new Producto("Camara Sony", 100);
		Producto p2 = new Producto("HP 100", 400);

		ItemFactura if1 = new ItemFactura(p1, 3);
		ItemFactura if2 = new ItemFactura(p2, 7);

		return Arrays.asList(if1, if2);
	}

	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOfi() {
		Producto p1 = new Producto("Monitor LG", 100);
		Producto p2 = new Producto("ChromeCast", 400);
		Producto p3 = new Producto("Impresora HP", 50);
		Producto p4 = new Producto("Escritorio oficina", 300);

		ItemFactura if1 = new ItemFactura(p1, 5);
		ItemFactura if2 = new ItemFactura(p2, 6);
		ItemFactura if3 = new ItemFactura(p3, 2);
		ItemFactura if4 = new ItemFactura(p4, 1);

		return Arrays.asList(if1, if2, if3, if4);
	}
}
