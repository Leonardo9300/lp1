package unidade4;

public class Break {

	public static void main(String[] args) {
		int contador; // variável de controle também utilizada depois que loop termina

		for (contador = 1; contador <= 10; contador++) { // faz o loop 10 vezes
			if (contador == 5)
				break; // termina o loop se a contagem for 5

			System.out.printf("%d ", contador);
		}
		System.out.printf("%nSaiu fora do loop no contador = %d%n", contador);
	}

}
