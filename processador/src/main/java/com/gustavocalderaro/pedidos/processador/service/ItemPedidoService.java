package com.gustavocalderaro.pedidos.processador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavocalderaro.pedidos.processador.entity.ItemPedido;
import com.gustavocalderaro.pedidos.processador.entity.Pedido;
import com.gustavocalderaro.pedidos.processador.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {
    
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public List<ItemPedido> save(List<ItemPedido> itens) {
    	return itemPedidoRepository.saveAll(itens);
	}
	
	public void save(ItemPedido item) {
		itemPedidoRepository.save(item);
	}

	public void updatedItemPedido(List<ItemPedido> itemPedidos, Pedido pedido) {
		itemPedidos.forEach(item -> {
			item.setPedido(pedido);
			this.save(item);
		});
		
	} 
}
