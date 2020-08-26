package com.processar.pedidos.jobpld.route;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class ErrorRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	from("direct:error").log("ERRO: ${exception}");
    	
    }
}