package uninter;

public class Real extends Moeda {
	
	//Criação da moeda real que irá ser utilizada no cofre
	public Real(double valor1) {
		this.valor = valor1;
	}
	
	//Guardando a informação de quantos reais vão ser
	public void info() {
		System.out.println("Real - " + valor);
	}
	
	//Valor convertido
	public double conversao() {
		return this.valor;	
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		Real objetoReal = (Real) objeto;
		
		if(this.valor != objetoReal.valor) {
			return false;
		}
		return true;
	}
	

}
