package com.processar.pedidos.jobpld.route;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	 errorHandler(deadLetterChannel("direct:error"));
    	
    	from("timer://foo?fixedRate=true&period=3000").to("bean:pedidoService?method=pedidos").split().body().parallelProcessing()
    	.choice()
//    	.when(simple("${body.situacao} == 1")).to("bean:processarRecebidosService?method=processar")
    	.when(simple("${body.situacao} == 1")).to("direct:recebidos")
    	.when(simple("${body.situacao} == 71")).to("bean:processarGraylistService?method=processar(${body})")
    	.when(simple("${body.situacao} == 7")).to("bean:processarCrivoService?method=processar(${body})").endChoice();
    }
}