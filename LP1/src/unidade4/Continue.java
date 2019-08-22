package unidade4;

public class Continue {

	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++) { // faz o loop 10 vezes
			if (contador == 5)
				continue; // pula o código restante no corpo do loop se a contagem for 5

			System.out.printf("%d ", contador);
		}
		System.out.printf("%nUsou continue para pular a impressão do 5%n");

	}

}
