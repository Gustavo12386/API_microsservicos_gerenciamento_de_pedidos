package com.gustavocalderaro.pedidos.notificacao.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gustavocalderaro.pedidos.notificacao.entity.Pedido;
import com.gustavocalderaro.pedidos.notificacao.service.EmailService;

@Component
public class PedidoListener {

	private final Logger logger = LoggerFactory.getLogger(PedidoListener.class);
	
	@Autowired
	private EmailService emailService;
	
	@RabbitListener(queues = "pedidos.v1.pedido-criado.gerar-notificacao")
	public void enviarNotificacao(Pedido pedido) {
		emailService.enviarEmail(pedido);
		logger.info("Notificacao Gerada: {}", pedido.toString());
	}
}
