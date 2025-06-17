package com.gustavocalderaro.pedidos.processador.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "item-pedido")
public class ItemPedido {
	
	@Id
	private UUID id = UUID.randomUUID();
	@ManyToOne
	private Produto produto;
	private Integer quantidade;
	@ManyToOne
	private Pedido pedido;
	
}
