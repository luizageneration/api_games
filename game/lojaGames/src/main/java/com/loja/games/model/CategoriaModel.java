package com.loja.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "categoria")
public class CategoriaModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

	
		@Size(min = 5, max = 100)
		private String categoria;

		
		@Size(min = 10, max = 500)
		private String tipo;

		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<ProdutoModel> produtos;

		//GETTERS E SETTERS :-)
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public List<ProdutoModel> getProdutos() {
			return produtos;
		}

		public void setProdutos(List<ProdutoModel> produtos) {
			this.produtos = produtos;
		}
		

		
		
}
