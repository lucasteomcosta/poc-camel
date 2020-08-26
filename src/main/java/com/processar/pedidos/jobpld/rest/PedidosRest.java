package com.processar.pedidos.jobpld.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.processar.pedidos.jobpld.entity.Pedido;

@RestController("pedidos")
public class PedidosRest {
	
	@PostMapping
	public void processar(@RequestBody Pedido Pedido) {
		System.out.println(" ---> processar");
	}

}
