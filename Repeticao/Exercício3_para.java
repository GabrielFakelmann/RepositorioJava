//Desenvolvido por: Gabriel Fakelmann
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
  Se o denominador for igual a zero mostrar a mensagem &quot;divisao impossivel&quot;*/
//DATA: 23/09/2024
import java.util.Scanner;

public class Exercício3_para {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a quantidade de pares que deseje verificar a divisão: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Informe o " + (i + 1) + "° e o " + (i + 2 ) + " número para a verificação: ");
			double numera = scanner.nextDouble();
			double denomina = scanner.nextDouble();

			if (denomina == 0) {
				System.out.println("divisao impossivel");
			} else {
				double resultado = (double) numera / denomina;
				System.out.printf("A divisão de %.2f por %.2f é: %.2f%n", numera, denomina, resultado);			}
		}
		scanner.close();
	}
}