package br.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.model.Bebida;

@SuppressWarnings("deprecation")
@SessionScoped
@ManagedBean
public class BebidaBean {
	
	private Bebida bebida = new Bebida();
	private List<Bebida> bebidas = new ArrayList<>();
	
	public void adicionar() {
		this.bebidas.add(bebida);
		this.bebida = new Bebida();
	}
	
	public Bebida pesquisar(String nome) {
		for (Bebida bebida : bebidas) {
			if(bebida.getNome().contains(nome)) {
				return bebida;
			}
		}
		return new Bebida();
	}
	
	public Bebida getBebida() {
		return bebida;
	}
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	} 

	
	
}
