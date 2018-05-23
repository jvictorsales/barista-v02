package br.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.model.Comida;

@SuppressWarnings("deprecation")
@SessionScoped
@ManagedBean
public class ComidaBean {
	
	private Comida comida = new Comida();
	private List<Comida> comidas = new ArrayList<>();
	
	public void adicionar() {
		this.comidas.add(comida);
		this.comida = new Comida();
	}
	
	public Comida getComida() {
		return comida;
	}
	public void setComida(Comida comida) {
		this.comida = comida;
	}
	public List<Comida> getComidas() {
		return comidas;
	}
	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}
	
	
}
