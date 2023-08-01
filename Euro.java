package uninter;

public class Euro extends Moeda {

	
	public Euro(double valor1) {
		this.valor = valor1;
	}

	//Guardando a informação de quantos reais vão ser
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	//Valor convertido com a cotação
	public double conversao() {
		return this.valor * 5.5;
	}
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		Euro objetoEuro = (Euro) objeto;
		
		if(this.valor != objetoEuro.valor) {
			return false;
		}
		return true;
	}
}
