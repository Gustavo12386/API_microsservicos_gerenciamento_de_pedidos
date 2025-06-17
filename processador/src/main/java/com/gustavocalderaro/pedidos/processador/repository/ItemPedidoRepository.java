package com.gustavocalderaro.pedidos.processador.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavocalderaro.pedidos.processador.entity.ItemPedido;


@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, UUID> {

}
