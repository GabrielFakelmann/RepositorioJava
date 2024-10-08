
//Desenvolvido por Gabriel Fakelmann
// Data: 19/09/2024
// O codigo funciona como uma calculadora de bits
import java.util.Scanner;

public class CalculadorBits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=============================");
		System.out.println("====Calculadora de Bytes=====");
		System.out.println("=============================");
		System.out.println("Por favor, digite a quantidade de bits:  ");
		long bits = scanner.nextInt(); // Pede para o usuario informar a quantidade de bits para o programa calcular.

		if (bits < 0) { // Condicional para aceitar somentes números positivos.
			System.out.println("Quantidade de bits insuficiente.");
		} else {

			long bytes = bits / 8; // Calcula através de uma divisão por 8 a quantidade de Bytes.
			long bitsRestantes = bits % 8; // Calcula a quantidade de bits restantes através do resto da divisão por 8.

			System.out.println("A quantidade de bytes é: " + bytes); // Exibe os resultados(saída de dados).
			System.out.println("O restante de bits é: " + bitsRestantes);
			scanner.close(); // Fecha o Scanner, ou seja, a leitura de dados.
		}
	}
}
