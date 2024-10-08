//Desenvolvido por: Gabriel Fakelmann
/*Leia um valor inteiro N. Este valor será a quantidade de valoresinteiros X
  que serão lidos em seguida. Mostre quantos destes valores X estãodentro do intervalo [10,20] 
  e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra “dentro” e “fora”).*/
// DATA: 23/09/2024
import java.util.Scanner;

public class Exercício2_Para {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int inside = 0;
		int outside = 0;

		System.out.println("Digite quantos números deseje verificar: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + "° número para verificação");
			int x = scanner.nextInt();
			if (x >= 10 && x <= 20) {
				inside++;
			} else {
				outside++;
			}
		}

		System.out.println("Há: " + inside + " dentro");
		System.out.println("Há: " + outside + " fora");
		scanner.close();
	}

}
