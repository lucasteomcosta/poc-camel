package com.processar.pedidos.jobpld.service;

import org.apache.camel.Body;
import org.springframework.stereotype.Component;

import com.processar.pedidos.jobpld.entity.Pedido;

@Component("processarGraylistService")
public class ProcessarGraylistService {
	
	public void processar(@Body Pedido pedido) {
		System.out.println(" ---> Processar GrayList");
		System.out.println(pedido.getEvento());
	}

}
