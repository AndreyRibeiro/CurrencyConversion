package uninter;

import java.util.Scanner;

//Aqui é onde ficará armazenad a maioria das informações e a estrutura da interface
public class Interface 
{
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Interface() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	//Intercace principal
	public void exibirInterface() {
		System.out.println("COFRINHO:");
		System.out.println("1 - Adicionar moeda: ");
		System.out.println("2 - Remover moeda: ");
		System.out.println("3 - Listar moeda: ");
		System.out.println("4 - Calcular valor total convertido para real: ");
		System.out.println("0 - Encerrar");
		
		String opcao = sc.next();
		
		switch (opcao) {
		//Última opção, no caso, encerrar o programa
		case "0":
			System.out.println("Sistema Finalizado.");
			break;
		//Primeira opção - Adicionar moeda
		case "1":
			menuAdicionarMoedas();
			exibirInterface();
			break;
			
		case "2":
			menuRemoverMoedas();
			exibirInterface();
			break;
			
		case "3":
			cofrinho.listarMoedas();
			exibirInterface();
			break;
			
		case "4":
			double valorConvertido = cofrinho.Convertido();
			String valorOficial = String.valueOf(valorConvertido);
			valorOficial = valorOficial.replace(".", ",");
			System.out.println("O valor total convertido para real: " + valorConvertido);
			exibirInterface();
			break;
			
		default:
			System.out.println("Opção inválida.");
			exibirInterface();
			break;
		}
	} //Melhorar a visualização do código e separar em uma classe privada
	private void menuAdicionarMoedas() {
		System.out.println("Escolha uma moeda: ");
		System.out.println("1 - Real ");
		System.out.println("2 - Dolar ");
		System.out.println("3 - Euro ");
		int opcaoMoeda = sc.nextInt ();
		
		//Trocar a vírgula pelo ponto e facilitar no manejo de Double
		System.out.println("Digite o valor: ");
		String valorMoeda1 = sc.next();
		valorMoeda1 = valorMoeda1.replace(",", ".");
		double valorMoeda2 = Double.valueOf(valorMoeda1);
		
		Moeda moeda = null;
		
		//Condicional para acrescentar os diferentes tipos de moeda
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda2);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda2);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda2);
		} else {
			System.out.println("Opção inválida.");
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada.");
	}
	
	private void menuRemoverMoedas() {
		System.out.println("Escolha uma moeda: ");
		System.out.println("1 - Real ");
		System.out.println("2 - Dolar ");
		System.out.println("3 - Euro ");
		int opcaoMoeda1 = sc.nextInt ();
		
		//Trocar a vírgula pelo ponto e facilitar no manejo de Double
		System.out.println("Digite o valor: ");
		String valorMoeda11 = sc.next();
		valorMoeda11 = valorMoeda11.replace(",", ".");
		double valorMoeda21 = Double.valueOf(valorMoeda11);
		
		Moeda moeda1 = null;
		
		//Condicional para remover os diferentes tipos de moeda
		if (opcaoMoeda1 == 1) {
			moeda1 = new Real(valorMoeda21);
		} else if (opcaoMoeda1 == 2) {
			moeda1 = new Dolar(valorMoeda21);
		} else if (opcaoMoeda1 == 3) {
			moeda1 = new Euro(valorMoeda21);
		} else {
			System.out.println("Opção inválida.");
		}
	
		boolean moedaRemovida = cofrinho.remover(moeda1);
		
		if(moedaRemovida) {
			System.out.println("Moeda removida com sucesso.");
			} else {
				System.out.println("Não foi encontrada essa moeda.");
			}
	}
}