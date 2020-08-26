package com.processar.pedidos.jobpld.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProcessarRecebidos extends RouteBuilder {
	  @Override
	    public void configure() throws Exception {
	    	
	    	errorHandler(deadLetterChannel("direct:error"));
	    	
	    	from("direct:recebidos").to("bean:processarRecebidosService?method=processar");
	    	
	    }

}
