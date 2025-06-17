package com.gustavocalderaro.pedidos.processador.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gustavocalderaro.pedidos.processador.entity.ItemPedido;
import com.gustavocalderaro.pedidos.processador.entity.Pedido;
import com.gustavocalderaro.pedidos.processador.repository.PedidoRepository;


@Service
public class PedidoService {

	private final Logger logger = LoggerFactory.getLogger(PedidoService.class);
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private ItemPedidoService itemPedidoService;
	@Autowired
	private ProdutoService produtoService;
	
	public void save(Pedido pedido) {
		//salvamos os produtos
		produtoService.save(pedido.getItens());
		
		//salvamos os itens do pedido
		List<ItemPedido> itemPedidos = itemPedidoService.save(pedido.getItens());
		
		//salvamos o pedido
		pedidoRepository.save(pedido);
		
		//atualize o item pedido definido o pedido ao qual ele faz parte
		itemPedidoService.updatedItemPedido(itemPedidos, pedido);
		
		logger.info("Pedido salvo: {}", pedido.toString());
	}
}
