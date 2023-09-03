package contador;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Contador</h1>
 * <p>
 * A classe contador recebe via teclado, dos números,
 * e envia esses números para o método contar. 
 */
public class Contador {
	public static void main(String[] args) {
		System.out.println("Contador");
		System.out.println("--------");
		Scanner terminal = new Scanner(System.in);

		try {
			System.out.println("Digite o primeiro número");
			int numeroUm = terminal.nextInt();

			System.out.println("Digite o segundo Número");
			int numeroDois = terminal.nextInt();

			// chamando o método contendo a lógica de contagem
			contar(numeroUm, numeroDois);
		} catch (Exception e) {
			// ParametrosInvalidosException
			if (e instanceof InputMismatchException) {
				System.out.println("deve informar valores numéricos");
			}
			if (e instanceof ParametrosInvalidosException) {
				// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		} finally {
			// fechando o terminal1
			terminal.close();
		}
	}

	/**
	 * <h1>contar</h1>
	 * @param numeroUm - primeiro parâmetro.
	 * @param numeroDois - segundo parâmetro.
	 * @throws ParametrosInvalidosException
	 * <p>
	 * contar recebe dois parâmetros e imprime o resultado
	 * da subtração entre o segundo e o primeiro número, um a um.
	 * obs: o numeroDois não pode ser menor que o númeroUm. 
	 * 
	 */
	static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (numeroUm > numeroDois) {
			throw new ParametrosInvalidosException();
		}

		// realizar o for para imprimir os números com base na variável contagem
		int contagem = numeroDois - numeroUm;
		System.out.println("");
		for (int contador = 1; contador <= contagem; contador++) {
			System.out.println("Imprimindo o número " + contador);
		}
	}
}
