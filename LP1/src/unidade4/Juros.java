package unidade4;

public class Juros {

	public static void main(String[] args) {
		double valor; // quantia em depósito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double taxa = 0.05; // taxa de juros

		// exibe cabeçalhos
		System.out.printf("%s%20s %n", "Ano", "Valor depositado");

		// calcula quantidade de depósito para cada um dos dez anos
		for (int ano = 1; ano <= 10; ++ano) {
			// calcula nova quantidade durante ano especificado
			valor = principal * Math.pow(1.0 + taxa, ano);

			// exibe o ano e a quantidade
			System.out.printf("%4d%,20.2f%n", ano, valor);
		}
	}
}
