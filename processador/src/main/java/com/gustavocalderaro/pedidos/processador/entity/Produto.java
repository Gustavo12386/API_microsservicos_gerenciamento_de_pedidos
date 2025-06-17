package com.gustavocalderaro.pedidos.processador.entity;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "produto")
public class Produto {
   
	@Id
	private UUID id = UUID.randomUUID();
    private String nome;
    private Double valor;    
	
    
}
