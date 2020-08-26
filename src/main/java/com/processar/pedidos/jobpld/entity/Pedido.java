package com.processar.pedidos.jobpld.entity;

public class Pedido {
	
	
	private String evento;
	private Integer situacao;
	
	

	
	public Pedido(String evento, Integer situacao) {
		super();
		this.evento = evento;
		this.situacao = situacao;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Pedido() {
		
	}

	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}


}
