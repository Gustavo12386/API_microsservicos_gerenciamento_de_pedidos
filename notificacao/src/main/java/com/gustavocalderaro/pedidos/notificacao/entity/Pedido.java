package com.gustavocalderaro.pedidos.notificacao.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gustavocalderaro.pedidos.notificacao.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Pedido {

	private UUID id = UUID.randomUUID();
	private String cliente;
	private List<ItemPedido> itens = new ArrayList<>();
	private Double valorTotal;
	private String emailNotificacao;
	private Status status = Status.EM_PROCESSAMENTO;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataHora = LocalDateTime.now();
}
