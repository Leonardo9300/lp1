package unidade4;

public class Incremento {

	public static void main(String[] args) {
		// demonstra o operador de p�s-incremento
		int c = 5;
		System.out.printf("c antes do p�s-incremento: %d%n", c); // imprime 5
		System.out.printf("p�s-incrementa c: %d%n", c++); // imprime 5
		System.out.printf("c ap�s o p�s-incremento: %d%n", c); // imprime 6

		System.out.println(); // pula uma linha

		// demonstra o operador de pr�-incremento
		c = 5;
		System.out.printf("c antes do pr�-incremento: %d%n", c); // imprime 5
		System.out.printf("pr�-incrementa c: %d%n", ++c); // imprime 6
		System.out.printf("c ap�s o pr�-incremento: %d%n", c); // imprime 6

	}

}
