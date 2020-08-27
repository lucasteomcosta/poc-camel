package com.processar.pedidos.jobpld.service;

import org.apache.camel.Body;
import org.springframework.stereotype.Component;

import com.processar.pedidos.jobpld.entity.Pedido;

@Component("processarCrivoService")
public class ProcessarCrivoService {
	
	public void processar(@Body Pedido pedido) {
		System.out.println(" ------- Processar Crivo  ------- ");
		System.out.println("Número Evento: " + pedido.getEvento());
		System.out.println("Situação pedido: " + pedido.getSituacao());
		System.out.println("------> Simulando erro");
		pedido = null;
		pedido.getEvento();
	}

}
