package unidade3;

import java.util.Scanner;

public class Adiciona {

	public static void main(String[] args) {
		// Cria um Scanner para obter entrada via teclado
		Scanner entrada = new Scanner(System.in);

		// Define vari�veis
		int numero1, numero2, soma;

		System.out.println("Entre o primeiro inteiro: ");  // Prompt
		numero1 = entrada.nextInt();  //L� o primeiro n�mero
		
		System.out.println("Entre o segundo inteiro: ");  // Prompt
		numero2 = entrada.nextInt();  //L� o segundo n�mero
		
		// Exibe a soma
		System.out.printf("A soma � %d%n", numero1 + numero2);

	}

}
