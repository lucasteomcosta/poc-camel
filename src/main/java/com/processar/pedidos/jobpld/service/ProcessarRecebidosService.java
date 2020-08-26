package com.processar.pedidos.jobpld.service;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import com.processar.pedidos.jobpld.entity.Pedido;

@Component("processarRecebidosService")
public class ProcessarRecebidosService {
	
	public void processar(Exchange exchange) {
		System.out.println("  Processar Recebidos Exchange");
		System.out.println(exchange.getIn().getBody(Pedido.class).getEvento());
	}

}
