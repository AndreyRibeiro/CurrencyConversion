package uninter;

public class Dolar extends Moeda {

	
	public Dolar(double valor1) {
		this.valor = valor1;
	}
	
	//Guardando a informação de quantos reais vão ser
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	//Valor convertido com a cotação
	public double conversao() {
		return this.valor * 5.3;
	}
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		Dolar objetoDolar = (Dolar) objeto;
		
		if(this.valor != objetoDolar.valor) {
			return false;
		}
		return true;
	}

}
