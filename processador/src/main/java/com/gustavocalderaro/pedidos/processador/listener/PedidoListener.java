package com.gustavocalderaro.pedidos.processador.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gustavocalderaro.pedidos.processador.entity.Pedido;
import com.gustavocalderaro.pedidos.processador.entity.enums.Status;
import com.gustavocalderaro.pedidos.processador.listener.PedidoListener;
import com.gustavocalderaro.pedidos.processador.service.PedidoService;

@Component
public class PedidoListener {

	private final Logger logger = LoggerFactory.getLogger(PedidoListener.class);
	
	@Autowired
	private PedidoService pedidoService;
	
	@RabbitListener(queues = "pedidos.v1.pedido-criado.gerar-processamento")
	public void salvarPedido(Pedido pedido) {
		pedido.setStatus(Status.PROCESSADO);
		pedidoService.save(pedido);		
	}
	
	
}
