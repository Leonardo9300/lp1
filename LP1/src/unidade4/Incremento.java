package unidade4;

public class Incremento {

	public static void main(String[] args) {
		// demonstra o operador de pós-incremento
		int c = 5;
		System.out.printf("c antes do pós-incremento: %d%n", c); // imprime 5
		System.out.printf("pós-incrementa c: %d%n", c++); // imprime 5
		System.out.printf("c após o pós-incremento: %d%n", c); // imprime 6

		System.out.println(); // pula uma linha

		// demonstra o operador de pré-incremento
		c = 5;
		System.out.printf("c antes do pré-incremento: %d%n", c); // imprime 5
		System.out.printf("pré-incrementa c: %d%n", ++c); // imprime 6
		System.out.printf("c após o pré-incremento: %d%n", c); // imprime 6

	}

}
