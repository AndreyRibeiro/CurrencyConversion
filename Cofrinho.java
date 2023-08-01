package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	public static final double Convertido = 0;
	//Criar uma lista para guardar os tipos de moedas que irão ser guardadas
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}

	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda);
	}
	
	public void listarMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho esta vazio.");
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
		
	}
	
	public double Convertido() {
		if (this.listaMoedas.isEmpty()) {
		return 0;
	}

	double acumulado = 0;

	for (Moeda moeda : this.listaMoedas) {
		acumulado = acumulado + moeda.conversao();
		}
	
	return acumulado;
	}
}
