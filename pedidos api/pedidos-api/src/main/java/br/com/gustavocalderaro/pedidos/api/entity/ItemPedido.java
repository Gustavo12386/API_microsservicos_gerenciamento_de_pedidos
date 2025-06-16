package br.com.gustavocalderaro.pedidos.api.entity;

import java.util.UUID;


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
public class ItemPedido {
	
	private UUID id = UUID.randomUUID();
	private Produto produto;
	private Integer quantidade;
	
}
