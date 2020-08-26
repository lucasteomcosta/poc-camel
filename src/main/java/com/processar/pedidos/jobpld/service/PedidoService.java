package com.processar.pedidos.jobpld.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.processar.pedidos.jobpld.entity.Pedido;

@Component("pedidoService")
public class PedidoService {
	
	public List<Pedido> pedidos() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		Pedido pedido = new Pedido("038",1);
		pedidos.add(pedido);
		pedido = new Pedido("037",7);	
		pedidos.add(pedido);
		pedido = new Pedido("037",71);	
		pedidos.add(pedido);
		pedido = new Pedido("038",7);	
		pedidos.add(pedido);
//		List<Integer> status = new ArrayList<Integer>();
		
		return pedidos;
	}

}
