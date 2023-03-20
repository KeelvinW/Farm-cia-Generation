package com.example.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatótio!")
	@Size(min = 5, max = 100, message = "O atribulo nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo marca é obrigatótio!")
	@Size(min = 5, max = 100, message = "O atribulo marca deve conter no mínimo 05 e no máximo 100 caracteres")
	private String marca;
	
	@NotNull(message = "O atributo quantidade é obrigatótio!")
	private Integer quantidade;
	
	@NotNull(message = "O atributo preço é obrigatótio!")
	private Double preco;
	
	@ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
