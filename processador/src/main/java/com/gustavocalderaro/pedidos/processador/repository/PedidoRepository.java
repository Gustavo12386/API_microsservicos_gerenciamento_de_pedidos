package com.gustavocalderaro.pedidos.processador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import com.gustavocalderaro.pedidos.processador.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}
