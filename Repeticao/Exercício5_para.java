//Desenvolvido por: Gabriel Fakelmann
/* Fazer um programa para ler um número inteiro positivo N. Oprograma deve então mostrar na tela N linhas
  começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor
 conforme exemplo.*/
//DATA: 23/09/2024
import java.util.Scanner;

public class Exercício5_para {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Linha " + i + ":  " + i + " " + i * i + " " + i * i * i);
		}
		scanner.close();
	}
}
