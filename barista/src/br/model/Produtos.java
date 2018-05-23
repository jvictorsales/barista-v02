package br.model;

public abstract class Produtos{
	
	private Long id;
	private String nome;
	private Double preco;
	private String categoria;
	private Boolean diet;
	
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public Double getPreco() { return preco; }
	public void setPreco(Double preco) { this.preco = preco; }
	
	public String getCategoria() { return categoria; }
	public void setCategoria(String categoria) { this.categoria = categoria; }
	
	public Boolean getDiet() { return diet; }
	public void setDiet(Boolean diet) { this.diet = diet; }
	
}