package uninter;

//Base para a partir daqui criar os diferentes tipos de moeda e criar funções que irão ser mostradas para as moedas como quantidade da moeda e conversão
public abstract class Moeda {
	
	protected double valor;
	
	public abstract void info();
	public abstract double conversao();

}
