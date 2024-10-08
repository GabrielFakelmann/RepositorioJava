//Desenvolvido por: Gabriel Fakelmann
// Ler um número inteiro N e calcular todos os seus divisores.
//DATA: 23/09/2024
import java.util.Scanner;

public class Exercício4_para {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para saber quais são seus divisores: ");
		int N = scanner.nextInt();

		System.out.println("Divisores de " + N + ":");
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}
		scanner.close();
	}
}