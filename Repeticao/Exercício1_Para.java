//Desenvolvido por: Gabriel Fakelmann
//Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, valor por linha, inclusive o X se for o caso.
// DATA: 23/09/2024
import java.util.Scanner;

public class Exercício1_Para {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor e veja quantos números impares há de 0 até o valor escolhido: ");
		int x = scanner.nextInt();
		if (x > 1000) {
			System.out.println("Não autorizado, pois excede a quantidade máxima de 1000.");
		} else {

			for (int i = 0; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		scanner.close();
	}
}
