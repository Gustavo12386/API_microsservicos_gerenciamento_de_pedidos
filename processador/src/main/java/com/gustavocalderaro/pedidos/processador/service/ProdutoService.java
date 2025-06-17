package com.gustavocalderaro.pedidos.processador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavocalderaro.pedidos.processador.entity.ItemPedido;
import com.gustavocalderaro.pedidos.processador.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void save(List<ItemPedido> itens) {
		itens.forEach(item -> {
			produtoRepository.save(item.getProduto());
		});
	}
}
