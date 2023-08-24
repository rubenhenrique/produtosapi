package br.com.cotiinformatica.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "descricao", length = 250, nullable = false)
	private String descricao;
	
	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;
	
	@Column(name = "preco", precision = 18, scale = 2, nullable = false)
	private BigDecimal preco;
	
	@Column(name = "foto")
	private byte[] foto;
	
	@Column(name = "usuario_id", nullable = false)
	private UUID usuarioId;
	
	@ManyToMany
	private List<Categoria> categorias;
}
