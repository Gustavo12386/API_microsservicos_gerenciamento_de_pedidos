package com.gustavocalderaro.pedidos.notificacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.gustavocalderaro.pedidos.notificacao.entity.Pedido;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void enviarEmail(Pedido pedido) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		
		simpleMailMessage.setFrom("pedidos-api@company.com");
		simpleMailMessage.setTo(pedido.getEmailNotificacao());
		simpleMailMessage.setSubject("Pedido de Compra");
		simpleMailMessage.setText(this.gerarMensagem(pedido));
		mailSender.send(simpleMailMessage);
	}

	private String gerarMensagem(Pedido pedido) {
		String pedidoId = pedido.getId().toString();
		String cliente = pedido.getCliente();
		String valor = String.valueOf(pedido.getValorTotal());
		String status = pedido.getStatus().name();
		
		return String.format("Olá %s seu pedido de n° %s no valor de %s, foi realizado com sucesso.\nStatus: %s",
		cliente, pedidoId, valor, status);
	}
}
