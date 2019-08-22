package unidade4;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// Inicializa o scanner
		Scanner entrada = new Scanner(System.in);

		int nota = 0;     // Inicializa variáveis
		String conceito = null;
		// Prompt
		System.out.printf("%s%n%s%n %s%n %s%n", "Entre as notas inteiras na faixa 0-100.",
				"Digite o indicador de fim de arquivo para encerrar a entrada:",
				"No UNIX/Linux/Mac OS X digite <Ctrl> d e então pressione Enter",
				"No Windows digite <Ctrl> z e então pressione Enter");
		// Faz o loop até o usuário inserir o indicador de fim de arquivo
		while (entrada.hasNext()) {
			nota = entrada.nextInt(); // Lê nota

			switch (nota / 10) {
			case 9:     // a nota está entre 90
			case 10:	// e 100, inclusive 
				conceito = "A";
				break;  	// sai do switch
			case 8:		// nota entre 80 e 89
				conceito = "B";
				break;
			case 7:		// nota entre 70 e 79
				conceito = "C";
				break;
			case 6:		// nota entre 60 e 69
				conceito = "D";
				break;
			default:	// nota menor que 60
				conceito = "E";
			}		
			// Exibe a nota e o conceito
			System.out.printf("%s%d%s%s%n", "Nota: ", nota, " - Conceito: ", conceito);
		}
		entrada.close();

	}

}
